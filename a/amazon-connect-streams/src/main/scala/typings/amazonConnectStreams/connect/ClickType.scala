package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClickType extends StObject
@JSGlobal("connect.ClickType")
@js.native
object ClickType extends StObject {
  
  @js.native
  sealed trait ACCEPT
    extends StObject
       with ClickType
  
  @js.native
  sealed trait HANGUP
    extends StObject
       with ClickType
  
  @js.native
  sealed trait REJECT
    extends StObject
       with ClickType
}
