package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "BaseBlock")
@js.native
open class BaseBlock[T /* <: ValueBlock */, J /* <: ValueBlockJson */] ()
  extends StObject
     with LocalBaseBlock
     with IBaseBlock
     with IBerConvertible {
  def this(param0: BaseBlockParams) = this()
  def this(param0: Unit, valueBlockType: ValueBlockConstructor[T]) = this()
  def this(param0: BaseBlockParams, valueBlockType: ValueBlockConstructor[T]) = this()
  
  /* CompleteClass */
  var blockLength: Double = js.native
  
  /* CompleteClass */
  var error: String = js.native
  
  var idBlock: LocalIdentificationBlock = js.native
  
  /**
    * Determines whether two object instances are equal
    * @param other Object to compare with the current object
    */
  def isEqual(other: scala.Any): scala.Boolean = js.native
  
  var lenBlock: LocalLengthBlock = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* protected */ def onAsciiEncoding(): String = js.native
  
  /* CompleteClass */
  var optional: scala.Boolean = js.native
  
  def toBER(sizeOnly: scala.Boolean, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: Unit, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  
  def toString(encoding: StringEncoding): String = js.native
  
  var valueBlock: T = js.native
  
  /* CompleteClass */
  var warnings: js.Array[String] = js.native
}
object BaseBlock {
  
  @JSImport("asn1js", "BaseBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "BaseBlock.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
