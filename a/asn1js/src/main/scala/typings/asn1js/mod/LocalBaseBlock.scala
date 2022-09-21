package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class used as a base block for all remaining ASN.1 classes
  */
@js.native
trait LocalBaseBlock
  extends StObject
     with ILocalBaseBlock {
  
  /**
    * Returns a JSON representation of an object
    * @returns JSON object
    */
  def toJSON(): LocalBaseBlockJson = js.native
  
  /**
    * @deprecated since version 3.0.0
    */
  def valueBeforeDecode: js.typedarray.ArrayBuffer = js.native
  
  /**
    * @since 3.0.0
    */
  var valueBeforeDecodeView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated since version 3.0.0
    */
  def valueBeforeDecode_=(value: js.typedarray.ArrayBuffer): Unit = js.native
}
