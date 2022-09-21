package typings.ariClient.mod

import typings.ariClient.anon.OldMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mailbox
  extends StObject
     with Resource {
  
  /**
    * Destroy a mailbox.
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * Destroy a mailbox.
    */
  def delete(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Retrieve the current state of a mailbox.
    */
  def get(): js.Promise[Mailbox] = js.native
  /**
    * Retrieve the current state of a mailbox.
    */
  def get(callback: js.Function2[/* err */ js.Error, /* mailbox */ this.type, Unit]): Unit = js.native
  
  /**
    * List all mailboxes.
    */
  def list(): js.Promise[js.Array[Mailbox]] = js.native
  /**
    * List all mailboxes.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* mailboxs */ js.Array[this.type], Unit]): Unit = js.native
  
  /**
    * Name of the mailbox.
    */
  var name: String = js.native
  
  /**
    * Count of new messages in the mailbox.
    */
  var new_messages: Double = js.native
  
  /**
    * Count of old messages in the mailbox.
    */
  var old_messages: Double = js.native
  
  /**
    * Change the state of a mailbox. (Note - implicitly creates the mailbox).
    *
    * @param params.oldMessages - Count of old messages in the mailbox.
    * @param params.newMessages - Count of new messages in the mailbox.
    */
  def update(params: OldMessages): js.Promise[Unit] = js.native
  /**
    * Change the state of a mailbox. (Note - implicitly creates the mailbox).
    *
    * @param params.oldMessages - Count of old messages in the mailbox.
    * @param params.newMessages - Count of new messages in the mailbox.
    */
  def update(params: OldMessages, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
