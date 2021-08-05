package typings.activexLibreoffice.com_.sun.star.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait ArrayWrapper extends StObject {
  
  /**
    * Contains the Array to be passed.
    *
    * Multi-dimensional arrays can only be represented as a sequence where the elements of the sequence are themselves sequences. N-Levels of indirection
    * are possible, where N is the number of dimensions. Note: its perfectly legal to use this structure with a single dimensioned array just to indicate
    * the array indexing.
    */
  var Array: js.Any
  
  /** Indicates whether the Array should be have 1 or 0 based indexing. */
  var IsZeroIndex: Boolean
}
object ArrayWrapper {
  
  inline def apply(Array: js.Any, IsZeroIndex: Boolean): ArrayWrapper = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], IsZeroIndex = IsZeroIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayWrapper]
  }
  
  extension [Self <: ArrayWrapper](x: Self) {
    
    inline def setArray(value: js.Any): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setIsZeroIndex(value: Boolean): Self = StObject.set(x, "IsZeroIndex", value.asInstanceOf[js.Any])
  }
}
