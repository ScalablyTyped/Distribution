package typings.absintheSocket

import typings.absintheSocket.mod.GqlOperationType
import typings.absintheSocket.mod.RequestStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absintheSocketStrings {
  
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @scala.inline
  def canceling: canceling = "canceling".asInstanceOf[canceling]
  
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @scala.inline
  def sending: sending = "sending".asInstanceOf[sending]
  
  @scala.inline
  def sent: sent = "sent".asInstanceOf[sent]
  
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
  
  @js.native
  sealed trait canceled extends RequestStatus
  
  @js.native
  sealed trait canceling extends RequestStatus
  
  @js.native
  sealed trait mutation extends GqlOperationType
  
  @js.native
  sealed trait pending extends RequestStatus
  
  @js.native
  sealed trait query extends GqlOperationType
  
  @js.native
  sealed trait sending extends RequestStatus
  
  @js.native
  sealed trait sent extends RequestStatus
  
  @js.native
  sealed trait subscription extends GqlOperationType
}
