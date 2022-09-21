package typings.amqpConnectionManager

import typings.amqpConnectionManager.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("amqp-connection-manager/dist/esm/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wait_(timeInMs: Double): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeInMs.asInstanceOf[js.Any]).asInstanceOf[Cancel]
}
