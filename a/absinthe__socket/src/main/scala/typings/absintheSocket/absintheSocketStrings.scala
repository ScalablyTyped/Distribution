package typings.absintheSocket

import typings.absintheSocket.mod.GqlOperationType
import typings.absintheSocket.mod.RequestStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absintheSocketStrings {
  
  @js.native
  sealed trait canceled extends RequestStatus
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait canceling extends RequestStatus
  @scala.inline
  def canceling: canceling = "canceling".asInstanceOf[canceling]
  
  @js.native
  sealed trait mutation extends GqlOperationType
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  
  @js.native
  sealed trait pending extends RequestStatus
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait query extends GqlOperationType
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait sending extends RequestStatus
  @scala.inline
  def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent extends RequestStatus
  @scala.inline
  def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait subscription extends GqlOperationType
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
}
