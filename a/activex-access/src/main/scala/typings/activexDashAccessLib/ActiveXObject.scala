package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.DragDrop,
    argNames: js.Tuple5[
      activexDashAccessLib.activexDashAccessLibStrings.SourceCtlName, 
      activexDashAccessLib.activexDashAccessLibStrings.SourceFieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.SourceRow, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_SourceCtlName, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListCheckItem,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.FieldList],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.FieldList],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListDblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.FieldList],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListGotFocus,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.FieldListIndex],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldListIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListHdrDblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.FieldList],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListKeyDown,
    argNames: js.Tuple3[
      activexDashAccessLib.activexDashAccessLibStrings.FieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldListKeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListKeyPress,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.FieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.KeyAscii
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldListKeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListKeyUp,
    argNames: js.Tuple3[
      activexDashAccessLib.activexDashAccessLibStrings.FieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldListKeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListLostFocus,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.FieldListIndex],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_FieldListIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListMouseDown,
    argNames: js.Tuple5[
      activexDashAccessLib.activexDashAccessLibStrings.FieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_ButtonFieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListMouseMove,
    argNames: js.Tuple5[
      activexDashAccessLib.activexDashAccessLibStrings.FieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_ButtonFieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListMouseUp,
    argNames: js.Tuple5[
      activexDashAccessLib.activexDashAccessLibStrings.FieldList, 
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ Anon_ButtonFieldList, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    event: activexDashAccessLib.activexDashAccessLibStrings.ColumnCreated,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Column],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.ImexGrid, 
      /* parameter */ Anon_Column, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    event: activexDashAccessLib.activexDashAccessLibStrings.ColumnDeleted,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Column],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.ImexGrid, 
      /* parameter */ Anon_Column, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    event: activexDashAccessLib.activexDashAccessLibStrings.ColumnSelected,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Column],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.ImexGrid, 
      /* parameter */ Anon_Column, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    event: activexDashAccessLib.activexDashAccessLibStrings.ColumnSized,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Column],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.ImexGrid, 
      /* parameter */ Anon_Column, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.Dirty,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Updated,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Code],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ Anon_Code, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Dirty,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.NotInList,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.NewData, 
      activexDashAccessLib.activexDashAccessLibStrings.Response
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_NewData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Undo,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CustomControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CustomControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.CustomControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Updated,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Code],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CustomControl, 
      /* parameter */ Anon_Code, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeInsert | activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate | activexDashAccessLib.activexDashAccessLibStrings.BeginBatchEdit | activexDashAccessLib.activexDashAccessLibStrings.DblClick | activexDashAccessLib.activexDashAccessLibStrings.Delete | activexDashAccessLib.activexDashAccessLibStrings.Dirty | activexDashAccessLib.activexDashAccessLibStrings.Open | activexDashAccessLib.activexDashAccessLibStrings.RecordExit | activexDashAccessLib.activexDashAccessLibStrings.Undo | activexDashAccessLib.activexDashAccessLibStrings.UndoBatchEdit | activexDashAccessLib.activexDashAccessLibStrings.Unload,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.Activate | activexDashAccessLib.activexDashAccessLibStrings.AfterInsert | activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate | activexDashAccessLib.activexDashAccessLibStrings.BeforeQuery | activexDashAccessLib.activexDashAccessLibStrings.Click | activexDashAccessLib.activexDashAccessLibStrings.Close | activexDashAccessLib.activexDashAccessLibStrings.Current | activexDashAccessLib.activexDashAccessLibStrings.DataSetChange | activexDashAccessLib.activexDashAccessLibStrings.Deactivate | activexDashAccessLib.activexDashAccessLibStrings.GotFocus | activexDashAccessLib.activexDashAccessLibStrings.Load | activexDashAccessLib.activexDashAccessLibStrings.LostFocus | activexDashAccessLib.activexDashAccessLibStrings.OnConnect | activexDashAccessLib.activexDashAccessLibStrings.OnDisconnect | activexDashAccessLib.activexDashAccessLibStrings.Query | activexDashAccessLib.activexDashAccessLibStrings.Resize | activexDashAccessLib.activexDashAccessLibStrings.SelectionChange | activexDashAccessLib.activexDashAccessLibStrings.Timer,
    handler: js.ThisFunction1[/* this */ activexDashAccessLib.AccessNs.Form, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterDelConfirm,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Status],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Status, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterFinalRender,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.drawObject],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_DrawObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterLayout,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.drawObject],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_DrawObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterRender,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.drawObject, 
      activexDashAccessLib.activexDashAccessLibStrings.chartObject
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_ChartObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.ApplyFilter,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.ApplyType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_ApplyType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeDelConfirm,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.Response
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_CancelResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeRender,
    argNames: js.Tuple3[
      activexDashAccessLib.activexDashAccessLibStrings.drawObject, 
      activexDashAccessLib.activexDashAccessLibStrings.chartObject, 
      activexDashAccessLib.activexDashAccessLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_CancelChartObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeScreenTip,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.ScreenTipText, 
      activexDashAccessLib.activexDashAccessLibStrings.SourceObject
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_ScreenTipText, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.CommandBeforeExecute,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Command, 
      activexDashAccessLib.activexDashAccessLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_CancelCommand, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.CommandChecked,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Command, 
      activexDashAccessLib.activexDashAccessLibStrings.Checked
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Checked, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.CommandEnabled,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Command, 
      activexDashAccessLib.activexDashAccessLibStrings.Enabled
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Command, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.CommandExecute,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Command],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_CommandAny, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.DataChange,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Reason],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Reason, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.Error,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.DataErr, 
      activexDashAccessLib.activexDashAccessLibStrings.Response
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_DataErr, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.Filter,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.FilterType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_CancelFilterType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseWheel,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Page, 
      activexDashAccessLib.activexDashAccessLibStrings.Count
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Count, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.PivotTableChange,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Reason],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Reason, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Form,
    event: activexDashAccessLib.activexDashAccessLibStrings.ViewChange,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Reason],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Form, 
      /* parameter */ Anon_Reason, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Image,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Image, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Image,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Image, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Image,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Image, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Image,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Image, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Label,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Label, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Label,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Label, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Label,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Label, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Label,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Label, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Dirty,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Undo,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Updated,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Code],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ Anon_Code, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Page,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Page, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Page,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Page, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Page,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Page, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Page,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Page, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Rectangle,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Rectangle, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Rectangle,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Rectangle, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Rectangle,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Rectangle, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Rectangle,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Rectangle, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.References,
    event: activexDashAccessLib.activexDashAccessLibStrings.ItemAdded,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Reference],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.References, 
      /* parameter */ Anon_Reference, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.References,
    event: activexDashAccessLib.activexDashAccessLibStrings.ItemRemoved,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Reference],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.References, 
      /* parameter */ Anon_Reference, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.Activate | activexDashAccessLib.activexDashAccessLibStrings.Click | activexDashAccessLib.activexDashAccessLibStrings.Close | activexDashAccessLib.activexDashAccessLibStrings.Current | activexDashAccessLib.activexDashAccessLibStrings.Deactivate | activexDashAccessLib.activexDashAccessLibStrings.GotFocus | activexDashAccessLib.activexDashAccessLibStrings.Load | activexDashAccessLib.activexDashAccessLibStrings.LostFocus | activexDashAccessLib.activexDashAccessLibStrings.Page | activexDashAccessLib.activexDashAccessLibStrings.Resize | activexDashAccessLib.activexDashAccessLibStrings.Timer,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.ApplyFilter,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.ApplyType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_ApplyType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.Error,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.DataErr, 
      activexDashAccessLib.activexDashAccessLibStrings.Response
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_DataErr, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.Filter,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.FilterType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_CancelFilterType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseWheel,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Page, 
      activexDashAccessLib.activexDashAccessLibStrings.Count
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Count, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.NoData,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.Open,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Report,
    event: activexDashAccessLib.activexDashAccessLibStrings.Unload,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Report, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Section,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Section, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Section,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Section, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Section,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Section, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.Section,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Section, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.SubForm,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.SubForm, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.SubReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.SubReport, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Dirty,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Undo,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Dirty,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.DocumentComplete,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.pDisp, 
      activexDashAccessLib.activexDashAccessLibStrings.URL
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_PDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.NavigateError,
    argNames: js.Tuple5[
      activexDashAccessLib.activexDashAccessLibStrings.pDisp, 
      activexDashAccessLib.activexDashAccessLibStrings.URL, 
      activexDashAccessLib.activexDashAccessLibStrings.TargetFrameName, 
      activexDashAccessLib.activexDashAccessLibStrings.StatusCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_CancelPDisp, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.ProgressChange,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Progress, 
      activexDashAccessLib.activexDashAccessLibStrings.ProgressMax
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Progress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Updated,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Code],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ Anon_Code, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Format,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.FormatCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ Anon_CancelFormatCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Print,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.PrintCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ Anon_CancelPrintCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Format,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.FormatCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ Anon_CancelFormatCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Print,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.Cancel, 
      activexDashAccessLib.activexDashAccessLibStrings.PrintCount
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ Anon_CancelPrintCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeUpdate,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.DblClick,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Exit,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyDown,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyPress,
    argNames: js.Array[activexDashAccessLib.activexDashAccessLibStrings.KeyAscii],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_KeyAscii, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.KeyUp,
    argNames: js.Tuple2[
      activexDashAccessLib.activexDashAccessLibStrings.KeyCode, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_KeyCode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashAccessLib.activexDashAccessLibStrings.Button, 
      activexDashAccessLib.activexDashAccessLibStrings.Shift, 
      activexDashAccessLib.activexDashAccessLibStrings.X, 
      activexDashAccessLib.activexDashAccessLibStrings.Y
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ Anon_Button, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterStartup(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterStartup,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.AfterUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AttachmentCurrent(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.AttachmentCurrent,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.BeforeNavigate2,
    argNames: activexDashAccessLib.AccessNs.EventHelperTypesNs.WebBrowserControl_BeforeNavigate2_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ activexDashAccessLib.AccessNs.EventHelperTypesNs.WebBrowserControl_BeforeNavigate2_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Change(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Change,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.Image,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Image, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.Label,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Label, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.Page,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[/* this */ activexDashAccessLib.AccessNs.Page, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.Rectangle,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Rectangle, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.Section,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Section, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.TabControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TabControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Click(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Click,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.DragOver,
    argNames: activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs.FieldList_DragOver_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs.FieldList_DragOver_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.CustomControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CustomControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.OptionGroup,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionGroup, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.SubForm,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.SubForm, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.SubReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.SubReport, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.Enter,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FldListDragDrop(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListDragDrop,
    argNames: activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs.FieldList_FldListDragDrop_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs.FieldList_FldListDragDrop_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_FldListDragOver(
    obj: activexDashAccessLib.AccWizObjectsNs.FieldList,
    event: activexDashAccessLib.activexDashAccessLibStrings.FldListDragOver,
    argNames: activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs.FieldList_FldListDragOver_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccWizObjectsNs.FieldList, 
      /* parameter */ activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs.FieldList_FldListDragOver_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.CustomControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CustomControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Initialize(
    obj: activexDashAccessLib.AccessNs.Class,
    event: activexDashAccessLib.activexDashAccessLibStrings.Initialize,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Class, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.Attachment,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Attachment, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.BoundObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.BoundObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.CheckBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CheckBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.CommandButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CommandButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.CustomControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.CustomControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.ListBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ListBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.NavigationButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.NavigationControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.NavigationControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.ObjectFrame,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ObjectFrame, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.OptionButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.OptionButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.PaletteButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.PaletteButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.TextBox,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.TextBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.ToggleButton,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.ToggleButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs.WebBrowserControl,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.WebBrowserControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._CheckBoxInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs._OptionButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._OptionButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashAccessLib.AccessNs._ToggleButtonInOption,
    event: activexDashAccessLib.activexDashAccessLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._ToggleButtonInOption, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: activexDashAccessLib.AccessNs.Section,
    event: activexDashAccessLib.activexDashAccessLibStrings.Paint,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Section, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: activexDashAccessLib.AccessNs._PageHdrFtrInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Paint,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._PageHdrFtrInReport, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Paint,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Retreat(
    obj: activexDashAccessLib.AccessNs._SectionInReport,
    event: activexDashAccessLib.activexDashAccessLibStrings.Retreat,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs._SectionInReport, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Terminate(
    obj: activexDashAccessLib.AccessNs.Class,
    event: activexDashAccessLib.activexDashAccessLibStrings.Terminate,
    handler: js.ThisFunction1[
      /* this */ activexDashAccessLib.AccessNs.Class, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("set")
  def set_Columns(
    obj: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.Columns,
    parameterTypes: js.Array[scala.Double],
    newValue: js.Any
  ): scala.Unit = js.native
  @JSName("set")
  def set_RowText(
    obj: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.RowText,
    parameterTypes: js.Array[scala.Double],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_Selected(
    obj: activexDashAccessLib.AccessNs.ComboBox,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.Selected,
    parameterTypes: js.Array[scala.Double],
    newValue: scala.Double
  ): scala.Unit = js.native
  @JSName("set")
  def set_Selected(
    obj: activexDashAccessLib.AccessNs.Control,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.Selected,
    parameterTypes: js.Array[scala.Double],
    newValue: scala.Double
  ): scala.Unit = js.native
  @JSName("set")
  def set_Selected(
    obj: activexDashAccessLib.AccessNs.ListBox,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.Selected,
    parameterTypes: js.Array[scala.Double],
    newValue: scala.Double
  ): scala.Unit = js.native
  @JSName("set")
  def set_Selected(
    obj: activexDashAccessLib.AccessNs._ControlInReportEvents,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.Selected,
    parameterTypes: js.Array[scala.Double],
    newValue: scala.Double
  ): scala.Unit = js.native
  @JSName("set")
  def set_accName(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption | activexDashAccessLib.AccessNs._ChildLabel | activexDashAccessLib.AccessNs._CustomControlInReport | activexDashAccessLib.AccessNs._OptionButtonInOption | activexDashAccessLib.AccessNs._ToggleButtonInOption | activexDashAccessLib.AccessNs.Attachment | activexDashAccessLib.AccessNs.BoundObjectFrame | activexDashAccessLib.AccessNs.CheckBox | activexDashAccessLib.AccessNs.ComboBox | activexDashAccessLib.AccessNs.CommandButton | activexDashAccessLib.AccessNs.CustomControl | activexDashAccessLib.AccessNs.EmptyCell | activexDashAccessLib.AccessNs.Form | activexDashAccessLib.AccessNs.Label | activexDashAccessLib.AccessNs.ListBox | activexDashAccessLib.AccessNs.NavigationButton | activexDashAccessLib.AccessNs.NavigationControl | activexDashAccessLib.AccessNs.ObjectFrame | activexDashAccessLib.AccessNs.OptionButton | activexDashAccessLib.AccessNs.OptionGroup | activexDashAccessLib.AccessNs.Page | activexDashAccessLib.AccessNs.SubForm | activexDashAccessLib.AccessNs.TabControl | activexDashAccessLib.AccessNs.TextBox | activexDashAccessLib.AccessNs.ToggleButton | activexDashAccessLib.AccessNs.WebBrowserControl,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.accName,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_accValue(
    obj: activexDashAccessLib.AccessNs._CheckBoxInOption | activexDashAccessLib.AccessNs._ChildLabel | activexDashAccessLib.AccessNs._CustomControlInReport | activexDashAccessLib.AccessNs._OptionButtonInOption | activexDashAccessLib.AccessNs._ToggleButtonInOption | activexDashAccessLib.AccessNs.Attachment | activexDashAccessLib.AccessNs.BoundObjectFrame | activexDashAccessLib.AccessNs.CheckBox | activexDashAccessLib.AccessNs.ComboBox | activexDashAccessLib.AccessNs.CommandButton | activexDashAccessLib.AccessNs.CustomControl | activexDashAccessLib.AccessNs.EmptyCell | activexDashAccessLib.AccessNs.Form | activexDashAccessLib.AccessNs.Label | activexDashAccessLib.AccessNs.ListBox | activexDashAccessLib.AccessNs.NavigationButton | activexDashAccessLib.AccessNs.NavigationControl | activexDashAccessLib.AccessNs.ObjectFrame | activexDashAccessLib.AccessNs.OptionButton | activexDashAccessLib.AccessNs.OptionGroup | activexDashAccessLib.AccessNs.Page | activexDashAccessLib.AccessNs.SubForm | activexDashAccessLib.AccessNs.TabControl | activexDashAccessLib.AccessNs.TextBox | activexDashAccessLib.AccessNs.ToggleButton | activexDashAccessLib.AccessNs.WebBrowserControl,
    propertyName: activexDashAccessLib.activexDashAccessLibStrings.accValue,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
}

