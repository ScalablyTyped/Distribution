package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashOutlookLib.OutlookNs.AccountSelector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.SelectedAccountChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.SelectedAccount],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AccountSelector, 
      /* parameter */ Anon_SelectedAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Accounts,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AutoDiscoverComplete,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Account],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Accounts, 
      /* parameter */ Anon_Account, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AdvancedSearchComplete,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.SearchObject],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_SearchObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AdvancedSearchStopped,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.SearchObject],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_SearchObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentContextMenuDisplay,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.CommandBar, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachments
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_CommandBar, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeFolderSharingDialog,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.FolderToShare, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ContextMenuClose,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.ContextMenu],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_ContextMenu, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.FolderContextMenuDisplay,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.CommandBar, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Folder
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_Folder, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemContextMenuDisplay,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.CommandBar, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Selection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_CommandBarSelection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemLoad,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Item],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemSend,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.NewMailEx,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.EntryIDCollection],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_EntryIDCollection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.OptionsPagesAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Pages],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_Pages, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reminder,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Item],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ShortcutContextMenuDisplay,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.CommandBar, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shortcut
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_CommandBarShortcut, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.StoreContextMenuDisplay,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.CommandBar, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Store
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_CommandBarStore, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ViewContextMenuDisplay,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.CommandBar, 
      activexDashOutlookLib.activexDashOutlookLibStrings.View
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ Anon_CommandBarView, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeFolderSwitch,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.NewFolder, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelNewFolder, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeItemCopy,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeItemCut,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeItemPaste,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.ClipboardContent, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Target, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_ClipboardContent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeMaximize,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeMinimize,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeMove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeSize,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeViewSwitch,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.NewView, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ Anon_CancelNewView, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Explorers,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.NewExplorer,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Explorer],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorers, 
      /* parameter */ Anon_Explorer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Folder,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeFolderMove,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.MoveTo, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Folder, 
      /* parameter */ Anon_CancelMoveTo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Folder,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeItemMove,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.MoveTo, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Folder, 
      /* parameter */ Anon_ItemCancelMoveTo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Folders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.FolderAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Folder],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Folders, 
      /* parameter */ Anon_Folder_496252198, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Folders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.FolderChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Folder],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Folders, 
      /* parameter */ Anon_Folder_496252198, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.FormRegion,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Expanded,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Expand],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.FormRegion, 
      /* parameter */ Anon_Expand, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeMaximize,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeMinimize,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeMove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeSize,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PageChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.ActivePageName],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ Anon_ActivePageName, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Inspectors,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.NewInspector,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Inspector],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspectors, 
      /* parameter */ Anon_Inspector, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Items,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Item],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Items, 
      /* parameter */ Anon_Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Items,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Item],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Items, 
      /* parameter */ Anon_Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.NameSpace,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.OptionsPagesAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Pages, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Folder
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.NameSpace, 
      /* parameter */ Anon_FolderPages, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.NavigationGroups,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.NavigationFolderAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.NavigationFolder],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.NavigationGroups, 
      /* parameter */ Anon_NavigationFolder, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.NavigationGroups,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.SelectedChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.NavigationFolder],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.NavigationGroups, 
      /* parameter */ Anon_NavigationFolder, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.NavigationPane,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ModuleSwitch,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.CurrentModule],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.NavigationPane, 
      /* parameter */ Anon_CurrentModule, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkBusinessCardControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkBusinessCardControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkBusinessCardControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkBusinessCardControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkBusinessCardControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkBusinessCardControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkInfoBar,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkInfoBar, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkInfoBar,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkInfoBar, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkInfoBar,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkInfoBar, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkLabel,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkLabel, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkLabel,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkLabel, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkLabel,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkLabel, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkSenderPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkSenderPhoto, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkSenderPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkSenderPhoto, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkSenderPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkSenderPhoto, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Exit,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_CancelBoolean_724145444, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyPress,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.KeyCode, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.Button, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Shift, 
      activexDashOutlookLib.activexDashOutlookLibStrings.X, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ Anon_Y, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarGroups,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeGroupAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarGroups, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarGroups,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeGroupRemove,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Group, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarGroups, 
      /* parameter */ Anon_CancelGroup, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarGroups,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.GroupAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.NewGroup],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarGroups, 
      /* parameter */ Anon_NewGroup, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarPane,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeGroupSwitch,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.ToGroup, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarPane, 
      /* parameter */ Anon_ToGroup, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarPane,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeNavigate,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Shortcut, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarPane, 
      /* parameter */ Anon_CancelShortcut, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarShortcuts,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeShortcutAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarShortcuts, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarShortcuts,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeShortcutRemove,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Shortcut, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarShortcuts, 
      /* parameter */ Anon_CancelShortcut, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.OutlookBarShortcuts,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ShortcutAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.NewShortcut],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OutlookBarShortcuts, 
      /* parameter */ Anon_NewShortcut, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Reminders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeReminderShow,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Reminders, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Reminders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReminderAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.ReminderObject],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Reminders, 
      /* parameter */ Anon_ReminderObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Reminders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReminderChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.ReminderObject],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Reminders, 
      /* parameter */ Anon_ReminderObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Reminders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReminderFire,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.ReminderObject],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Reminders, 
      /* parameter */ Anon_ReminderObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Reminders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Snooze,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.ReminderObject],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Reminders, 
      /* parameter */ Anon_ReminderObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Results,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Item],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Results, 
      /* parameter */ Anon_Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Results,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Item],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Results, 
      /* parameter */ Anon_Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Stores,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeStoreRemove,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Store, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Stores, 
      /* parameter */ Anon_CancelStore, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Stores,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.StoreAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Store],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Stores, 
      /* parameter */ Anon_Store, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SyncObject,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.OnError,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Code, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Description
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SyncObject, 
      /* parameter */ Anon_Description, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.SyncObject,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Progress,
    argNames: js.Tuple4[
      activexDashOutlookLib.activexDashOutlookLibStrings.State, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Description, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Value, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Max
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SyncObject, 
      /* parameter */ Anon_Value, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRead,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Attachment],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Attachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentAdd,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentPreview,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentRead,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentSave,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Attachment, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelAttachment, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeAutoSave,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeCheckNames,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeDelete,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Item, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_ItemCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomAction,
    argNames: js.Tuple3[
      activexDashOutlookLib.activexDashOutlookLibStrings.Action, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Action, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.CustomPropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Forward,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Forward, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Forward, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Open,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.PropertyChange,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Name],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_Name, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReplyAll,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Reply,
    argNames: js.Tuple2[
      activexDashOutlookLib.activexDashOutlookLibStrings.Response, 
      activexDashOutlookLib.activexDashOutlookLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Send,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Write,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Views,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ViewAdd,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.View],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Views, 
      /* parameter */ Anon_View, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOutlookLib.OutlookNs.Views,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ViewRemove,
    argNames: js.Array[activexDashOutlookLib.activexDashOutlookLibStrings.View],
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Views, 
      /* parameter */ Anon_View, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Activate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Activate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AfterWrite,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AttachmentSelectionChange(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentSelectionChange,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AttachmentSelectionChange(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AttachmentSelectionChange,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AutoDiscoverComplete(
    obj: activexDashOutlookLib.OutlookNs.NameSpace,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.AutoDiscoverComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.NameSpace, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.BeforeRead,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkSenderPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkSenderPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkBusinessCardControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkBusinessCardControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkInfoBar,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkInfoBar, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkLabel,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkLabel, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkSenderPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkSenderPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Close(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Close(
    obj: activexDashOutlookLib.OutlookNs.FormRegion,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.FormRegion, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Close(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Close,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Deactivate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: activexDashOutlookLib.OutlookNs.Inspector,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Deactivate,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Inspector, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkBusinessCardControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkBusinessCardControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkInfoBar,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkInfoBar, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkLabel,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkLabel, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkSenderPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkSenderPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DoubleClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DropButtonClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DropButtonClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DropButtonClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.DropButtonClick,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkCategory,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCategory, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkCheckBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkComboBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkCommandButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkCommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkContactPhoto,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkContactPhoto, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkDateControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkDateControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkListBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkOptionButton,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkOptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkTextBox,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashOutlookLib.OutlookNs.OlkTimeZoneControl,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.OlkTimeZoneControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FolderRemove(
    obj: activexDashOutlookLib.OutlookNs.Folders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.FolderRemove,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Folders, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FolderSwitch(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.FolderSwitch,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ItemRemove(
    obj: activexDashOutlookLib.OutlookNs.Items,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemRemove,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Items, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ItemRemove(
    obj: activexDashOutlookLib.OutlookNs.Results,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ItemRemove,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Results, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_MAPILogonComplete(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.MAPILogonComplete,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_NavigationFolderRemove(
    obj: activexDashOutlookLib.OutlookNs.NavigationGroups,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.NavigationFolderRemove,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.NavigationGroups, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_NewMail(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.NewMail,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Quit,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Read(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Read,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ReminderRemove(
    obj: activexDashOutlookLib.OutlookNs.Reminders,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ReminderRemove,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Reminders, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_SelectionChange(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.SelectionChange,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Startup(
    obj: activexDashOutlookLib.OutlookNs.Application,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Startup,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_SyncEnd(
    obj: activexDashOutlookLib.OutlookNs.SyncObject,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.SyncEnd,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SyncObject, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_SyncStart(
    obj: activexDashOutlookLib.OutlookNs.SyncObject,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.SyncStart,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SyncObject, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.AppointmentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.AppointmentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.ContactItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ContactItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.DistListItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DistListItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.DocumentItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.DocumentItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.JournalItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.JournalItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.MailItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MailItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.MeetingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MeetingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.MobileItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.MobileItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.PostItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.PostItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.RemoteItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.RemoteItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.ReportItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.ReportItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.SharingItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.SharingItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.TaskItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestAcceptItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestDeclineItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.Unload,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.TaskRequestUpdateItem, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ViewSwitch(
    obj: activexDashOutlookLib.OutlookNs.Explorer,
    event: activexDashOutlookLib.activexDashOutlookLibStrings.ViewSwitch,
    handler: js.ThisFunction1[
      /* this */ activexDashOutlookLib.OutlookNs.Explorer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

