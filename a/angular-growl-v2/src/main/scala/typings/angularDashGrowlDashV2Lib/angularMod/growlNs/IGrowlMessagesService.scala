package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * GrowlMessages service.
         */
@js.native
trait IGrowlMessagesService extends js.Object {
  /**
               * Add a message
               */
  def addMessage(message: IGrowlMessage): IGrowlMessage = js.native
  /**
               * Delete a message
               */
  def deleteMessage(message: IGrowlMessage): scala.Unit = js.native
  /**
               * Destroy all messages
               */
  def destroyAllMessages(): scala.Unit = js.native
  /**
               * Destroy all messages
               */
  def destroyAllMessages(referenceId: scala.Double): scala.Unit = js.native
  /**
               * Get current messages
               */
  def getAllMessages(): js.Array[IGrowlMessage] = js.native
  /**
               * Get current messages
               */
  def getAllMessages(referenceId: scala.Double): js.Array[IGrowlMessage] = js.native
  /**
               * Initialize a directive
               * We look at the preloaded directive and use this else we
               * create a new blank object
               * @param referenceId
               * @param limitMessages
               */
  def initDirective(referenceId: scala.Double, limitMessages: scala.Double): angularLib.angularMod.angularNs.IDirective[angularLib.angularMod.angularNs.IScope] = js.native
}

