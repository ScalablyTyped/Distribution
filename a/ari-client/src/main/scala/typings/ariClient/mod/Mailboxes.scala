package typings.ariClient.mod

import typings.ariClient.anon.MailboxName
import typings.ariClient.anon.OldMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mailboxes extends StObject {
  
  /**
    * Destroy a mailbox.
    *
    * @param params.mailboxName - Name of the mailbox.
    */
  def delete(params: MailboxName): js.Promise[Unit] = js.native
  /**
    * Destroy a mailbox.
    *
    * @param params.mailboxName - Name of the mailbox.
    */
  def delete(params: MailboxName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Retrieve the current state of a mailbox.
    *
    * @param params.mailboxName - Name of the mailbox.
    */
  def get(params: MailboxName): js.Promise[Mailbox] = js.native
  /**
    * Retrieve the current state of a mailbox.
    *
    * @param params.mailboxName - Name of the mailbox.
    */
  def get(params: MailboxName, callback: js.Function2[/* err */ js.Error, /* mailbox */ Mailbox, Unit]): Unit = js.native
  
  /**
    * List all mailboxes.
    */
  def list(): js.Promise[js.Array[Mailbox]] = js.native
  /**
    * List all mailboxes.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* mailboxs */ js.Array[Mailbox], Unit]): Unit = js.native
  
  /**
    * Change the state of a mailbox. (Note - implicitly creates the mailbox).
    *
    * @param params.mailboxName - Name of the mailbox.
    * @param params.oldMessages - Count of old messages in the mailbox.
    * @param params.newMessages - Count of new messages in the mailbox.
    */
  def update(params: OldMessages): js.Promise[Unit] = js.native
  /**
    * Change the state of a mailbox. (Note - implicitly creates the mailbox).
    *
    * @param params.mailboxName - Name of the mailbox.
    * @param params.oldMessages - Count of old messages in the mailbox.
    * @param params.newMessages - Count of new messages in the mailbox.
    */
  def update(params: OldMessages, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
