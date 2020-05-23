package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactStateType extends js.Object

@JSGlobal("connect.ContactStateType")
@js.native
object ContactStateType extends js.Object {
  @js.native
  sealed trait CONNECTED extends ContactStateType
  
  @js.native
  sealed trait CONNECTING extends ContactStateType
  
  @js.native
  sealed trait ENDED extends ContactStateType
  
  @js.native
  sealed trait ERROR extends ContactStateType
  
  @js.native
  sealed trait INCOMING extends ContactStateType
  
  @js.native
  sealed trait INIT extends ContactStateType
  
  @js.native
  sealed trait MISSED extends ContactStateType
  
  @js.native
  sealed trait PENDING extends ContactStateType
  
}

