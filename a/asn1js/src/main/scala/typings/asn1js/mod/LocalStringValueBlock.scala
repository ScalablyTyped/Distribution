package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalStringValueBlock
  extends ValueBlock
     with ILocalStringValueBlock {
  
  /**
    * @deprecated since version 3.0.0
    */
  @JSName("valueBeforeDecode")
  var valueBeforeDecode_FLocalStringValueBlock: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Binary data in ArrayBuffer representation
    *
    * @deprecated since version 3.0.0
    */
  var valueHex: js.typedarray.ArrayBuffer = js.native
}
