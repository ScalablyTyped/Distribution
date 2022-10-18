package typings.asyncValidator

import typings.asyncValidator.distTypesInterfaceMod.InternalValidateMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessagesMod {
  
  @JSImport("async-validator/dist-types/messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("async-validator/dist-types/messages", "messages")
  @js.native
  val messages: InternalValidateMessages = js.native
  
  inline def newMessages(): InternalValidateMessages = ^.asInstanceOf[js.Dynamic].applyDynamic("newMessages")().asInstanceOf[InternalValidateMessages]
}
