package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.EmvResponse")
@js.native
open class EmvResponse protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getTags(): Any = js.native
  
  def getTlvData(): Any = js.native
  
  def setTags(p_tags: Any): Unit = js.native
  
  def setTlvData(p_tlvData: Any): Unit = js.native
  
  var tags: Any = js.native
  
  var tlvData: Any = js.native
}
