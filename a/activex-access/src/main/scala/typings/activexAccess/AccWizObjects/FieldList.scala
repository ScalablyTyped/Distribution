package typings.activexAccess.AccWizObjects

import typings.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Field List Control */
@js.native
trait FieldList extends js.Object {
  
  @JSName("AccWizObjects.FieldList_typekey")
  var AccWizObjectsDotFieldList_typekey: FieldList = js.native
  
  def AddFieldList(
    bstrCaption: String,
    nLeft: Double,
    nTop: Double,
    nWidth: Double,
    nHeight: Double,
    nMultiSelectType: Double,
    cCols: Double,
    fShowPictures: Boolean
  ): Unit = js.native
  
  def AddJoinLine(
    IFieldList: Double,
    iField: Double,
    iForeignFieldList: Double,
    iForeignField: Double,
    lAttribs: Double
  ): Unit = js.native
  
  def DeleteFieldList(IFieldList: Double): Unit = js.native
  
  def DeleteJoinLine(IJoinLine: Double): Unit = js.native
  
  val FieldListCount: Double = js.native
  
  def FieldLists(IFieldList: Double): js.Any = js.native
  
  var HScrollPos: Double = js.native
  
  val JoinLineCount: Double = js.native
  
  def JoinLines(IJoinLine: Double): js.Any = js.native
  
  var PersistentHighlight: Boolean = js.native
  
  var Picture: IPictureDisp = js.native
  
  var PictureCols: Double = js.native
  
  var PictureRows: Double = js.native
  
  var ScrollBars: Double = js.native
  
  var SelectedFieldListIndex: Double = js.native
  
  def SetCursor(nCursorID: Double): Unit = js.native
  
  var VScrollPos: Double = js.native
}
object FieldList {
  
  @scala.inline
  def apply(
    AccWizObjectsDotFieldList_typekey: FieldList,
    AddFieldList: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit,
    AddJoinLine: (Double, Double, Double, Double, Double) => Unit,
    DeleteFieldList: Double => Unit,
    DeleteJoinLine: Double => Unit,
    FieldListCount: Double,
    FieldLists: Double => js.Any,
    HScrollPos: Double,
    JoinLineCount: Double,
    JoinLines: Double => js.Any,
    PersistentHighlight: Boolean,
    Picture: IPictureDisp,
    PictureCols: Double,
    PictureRows: Double,
    ScrollBars: Double,
    SelectedFieldListIndex: Double,
    SetCursor: Double => Unit,
    VScrollPos: Double
  ): FieldList = {
    val __obj = js.Dynamic.literal(AddFieldList = js.Any.fromFunction8(AddFieldList), AddJoinLine = js.Any.fromFunction5(AddJoinLine), DeleteFieldList = js.Any.fromFunction1(DeleteFieldList), DeleteJoinLine = js.Any.fromFunction1(DeleteJoinLine), FieldListCount = FieldListCount.asInstanceOf[js.Any], FieldLists = js.Any.fromFunction1(FieldLists), HScrollPos = HScrollPos.asInstanceOf[js.Any], JoinLineCount = JoinLineCount.asInstanceOf[js.Any], JoinLines = js.Any.fromFunction1(JoinLines), PersistentHighlight = PersistentHighlight.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureCols = PictureCols.asInstanceOf[js.Any], PictureRows = PictureRows.asInstanceOf[js.Any], ScrollBars = ScrollBars.asInstanceOf[js.Any], SelectedFieldListIndex = SelectedFieldListIndex.asInstanceOf[js.Any], SetCursor = js.Any.fromFunction1(SetCursor), VScrollPos = VScrollPos.asInstanceOf[js.Any])
    __obj.updateDynamic("AccWizObjects.FieldList_typekey")(AccWizObjectsDotFieldList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldList]
  }
  
  @scala.inline
  implicit class FieldListOps[Self <: FieldList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccWizObjectsDotFieldList_typekey(value: FieldList): Self = this.set("AccWizObjects.FieldList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFieldList(value: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit): Self = this.set("AddFieldList", js.Any.fromFunction8(value))
    
    @scala.inline
    def setAddJoinLine(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("AddJoinLine", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDeleteFieldList(value: Double => Unit): Self = this.set("DeleteFieldList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteJoinLine(value: Double => Unit): Self = this.set("DeleteJoinLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldListCount(value: Double): Self = this.set("FieldListCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLists(value: Double => js.Any): Self = this.set("FieldLists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHScrollPos(value: Double): Self = this.set("HScrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinLineCount(value: Double): Self = this.set("JoinLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinLines(value: Double => js.Any): Self = this.set("JoinLines", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPersistentHighlight(value: Boolean): Self = this.set("PersistentHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: IPictureDisp): Self = this.set("Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureCols(value: Double): Self = this.set("PictureCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureRows(value: Double): Self = this.set("PictureRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollBars(value: Double): Self = this.set("ScrollBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFieldListIndex(value: Double): Self = this.set("SelectedFieldListIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCursor(value: Double => Unit): Self = this.set("SetCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVScrollPos(value: Double): Self = this.set("VScrollPos", value.asInstanceOf[js.Any])
  }
}
