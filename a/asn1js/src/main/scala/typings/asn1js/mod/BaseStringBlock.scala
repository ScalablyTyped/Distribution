package typings.asn1js.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("asn1js", "BaseStringBlock")
@js.native
open class BaseStringBlock[T /* <: LocalStringValueBlock */, J /* <: BaseStringBlockJson */] protected ()
  extends BaseBlock[T, J]
     with IStringConvertible {
  def this(param0: Unit, stringValueBlockType: Instantiable0[T]) = this()
  def this(param0: BaseStringBlockParams, stringValueBlockType: Instantiable0[T]) = this()
  
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * @param inputBuffer ASN.1 BER encoded array
    */
  def fromBuffer(inputBuffer: js.typedarray.ArrayBuffer): Unit = js.native
  def fromBuffer(inputBuffer: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Creates a class object from the string
    * @param data Input string to convert from
    */
  /* CompleteClass */
  override def fromString(data: String): Unit = js.native
  
  /**
    * String value
    * @since 3.0.0
    */
  def getValue(): String = js.native
  
  /**
    * String value
    * @param value String value
    * @since 3.0.0
    */
  def setValue(value: String): Unit = js.native
}
object BaseStringBlock {
  
  @JSImport("asn1js", "BaseStringBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "BaseStringBlock.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
