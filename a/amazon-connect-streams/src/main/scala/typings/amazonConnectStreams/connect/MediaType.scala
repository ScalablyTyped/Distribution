package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaType extends StObject
@JSGlobal("connect.MediaType")
@js.native
object MediaType extends StObject {
  
  @js.native
  sealed trait CHAT
    extends StObject
       with MediaType
  
  @js.native
  sealed trait SOFTPHONE
    extends StObject
       with MediaType
}
