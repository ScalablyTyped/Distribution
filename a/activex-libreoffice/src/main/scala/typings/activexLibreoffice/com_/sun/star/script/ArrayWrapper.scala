package typings.activexLibreoffice.com_.sun.star.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an UNO sequence that is passed between different language boundries to indicate it prefers to be represented as a multidimensional array with 0
  * or 1 based indices. UNO does not natively represent Multi-Dimensional arrays, instead a sequence can have elements that are themselves sequences (an
  * array of arrays ).
  *
  * Some languages ( example BASIC ) can natively represent both Multi-Dimensional arrays and array of arrays. Those languages could represent a sequence
  * of sequences as either a Multi-Dimensional array or array of arrays. This structure allows a preference for a Multi-Dimensional array representation
  * to be specified.
  */
@js.native
trait ArrayWrapper extends js.Object {
  
  /**
    * Contains the Array to be passed.
    *
    * Multi-dimensional arrays can only be represented as a sequence where the elements of the sequence are themselves sequences. N-Levels of indirection
    * are possible, where N is the number of dimensions. Note: its perfectly legal to use this structure with a single dimensioned array just to indicate
    * the array indexing.
    */
  var Array: js.Any = js.native
  
  /** Indicates whether the Array should be have 1 or 0 based indexing. */
  var IsZeroIndex: Boolean = js.native
}
object ArrayWrapper {
  
  @scala.inline
  def apply(Array: js.Any, IsZeroIndex: Boolean): ArrayWrapper = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], IsZeroIndex = IsZeroIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayWrapper]
  }
  
  @scala.inline
  implicit class ArrayWrapperOps[Self <: ArrayWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArray(value: js.Any): Self = this.set("Array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsZeroIndex(value: Boolean): Self = this.set("IsZeroIndex", value.asInstanceOf[js.Any])
  }
}
