package typings.asana.mod

import typings.asana.mod.auth.AppOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options to configure the client */
trait ClientOptions
  extends StObject
     with AppOptions
     with DispatcherOptions
object ClientOptions {
  
  inline def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
}
