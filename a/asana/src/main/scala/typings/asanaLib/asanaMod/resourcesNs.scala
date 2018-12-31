package typings
package asanaLib.asanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "resources")
@js.native
object resourcesNs extends js.Object {
  /**
    * **Webhooks are currently in BETA - The information here may change.**
    *
    * Webhooks allow an application to be notified of changes. This is in addition
    * to the ability to fetch those changes directly as
    * [Events](/developers/api-reference/events) - in fact, Webhooks are just a way
    * to receive Events via HTTP POST at the time they occur instead of polling for
    * them. For services accessible via HTTP this is often vastly more convenient,
    * and if events are not too frequent can be significantly more efficient.
    *
    * In both cases, however, changes are represented as Event objects - refer to
    * the [Events documentation](/developers/api-reference/events) for more
    * information on what data these events contain.
    *
    * **NOTE:** While Webhooks send arrays of Event objects to their target, the
    * Event objects themselves contain *only IDs*, rather than the actual resource
    * they are referencing. So while a normal event you receive via GET /events
    * would look like this:
    *
    *     {\
    *       "resource": {\
    *         "id": 1337,\
    *         "name": "My Task"\
    *       },\
    *       "parent": null,\
    *       "created_at": "2013-08-21T18:20:37.972Z",\
    *       "user": {\
    *         "id": 1123,\
    *         "name": "Tom Bizarro"\
    *       },\
    *       "action": "changed",\
    *       "type": "task"\
    *     }
    *
    * In a Webhook payload you would instead receive this:
    *
    *     {\
    *       "resource": 1337,\
    *       "parent": null,\
    *       "created_at": "2013-08-21T18:20:37.972Z",\
    *       "user": 1123,\
    *       "action": "changed",\
    *       "type": "task"\
    *     }
    *
    * Webhooks themselves contain only the information necessary to deliver the
    * events to the desired target as they are generated.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  class Webhooks protected ()
    extends asanaLib.asanaMod.asanaNs.resourcesNs.Webhooks {
    /**
      * @param dispatcher
      */
    def this(dispatcher: asanaLib.asanaMod.asanaNs.Dispatcher) = this()
  }
  
  var Attachments: asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsStatic = js.native
  var Events: asanaLib.asanaMod.asanaNs.resourcesNs.EventsStatic = js.native
  var Projects: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsStatic = js.native
  var Resource: asanaLib.asanaMod.asanaNs.resourcesNs.ResourceStatic = js.native
  var Stories: asanaLib.asanaMod.asanaNs.resourcesNs.StoriesStatic = js.native
  var Tags: asanaLib.asanaMod.asanaNs.resourcesNs.TagsStatic = js.native
  var Tasks: asanaLib.asanaMod.asanaNs.resourcesNs.TasksStatic = js.native
  var Teams: asanaLib.asanaMod.asanaNs.resourcesNs.TeamsStatic = js.native
  var Users: asanaLib.asanaMod.asanaNs.resourcesNs.UsersStatic = js.native
  var Workspaces: asanaLib.asanaMod.asanaNs.resourcesNs.WorkspacesStatic = js.native
}

