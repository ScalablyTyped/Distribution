package typings
package antdLib.libTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends reactLib.reactMod.Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: antdLib.Anon_LeftDataSourceRightDataSource | scala.Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[java.lang.String], reactLib.reactMod.ReactNode]
  ): antdLib.Anon_ItemUnit = js.native
  def getSelectedKeysName(direction: TransferDirection): antdLib.antdLibStrings.sourceSelectedKeys | antdLib.antdLibStrings.targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[java.lang.String] = js.native
  def handleClear(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any
  ): scala.Unit = js.native
  def handleFilter(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any,
    e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]
  ): scala.Unit = js.native
  def handleLeftClear(): scala.Unit = js.native
  def handleLeftFilter(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleLeftScroll(e: reactLib.reactMod.SyntheticEvent[stdLib.HTMLDivElement, stdLib.Event]): scala.Unit = js.native
  def handleLeftSelect(selectedItem: TransferItem, checked: scala.Boolean): scala.Unit = js.native
  def handleLeftSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: scala.Boolean): scala.Unit = js.native
  def handleRightClear(): scala.Unit = js.native
  def handleRightFilter(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleRightScroll(e: reactLib.reactMod.SyntheticEvent[stdLib.HTMLDivElement, stdLib.Event]): scala.Unit = js.native
  def handleRightSelect(selectedItem: TransferItem, checked: scala.Boolean): scala.Unit = js.native
  def handleRightSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: scala.Boolean): scala.Unit = js.native
  def handleScroll(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any,
    e: reactLib.reactMod.SyntheticEvent[stdLib.HTMLDivElement, stdLib.Event]
  ): scala.Unit = js.native
  def handleSelect(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any,
    selectedItem: TransferItem,
    checked: scala.Boolean
  ): scala.Unit = js.native
  def handleSelectAll(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any,
    filteredDataSource: js.Array[TransferItem],
    checkAll: scala.Boolean
  ): scala.Unit = js.native
  def handleSelectChange(direction: TransferDirection, holder: js.Array[java.lang.String]): scala.Unit = js.native
  def moveTo(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any
  ): scala.Unit = js.native
  def moveToLeft(): scala.Unit = js.native
  def moveToRight(): scala.Unit = js.native
  def onItemSelect(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any,
    selectedKey: java.lang.String,
    checked: scala.Boolean
  ): scala.Unit = js.native
  def onItemSelectAll(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_antd/lib/collapse/Collapse.ExpandIconPosition */ js.Any,
    selectedKeys: js.Array[java.lang.String],
    checkAll: scala.Boolean
  ): scala.Unit = js.native
  def onLeftItemSelect(selectedKey: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def onLeftItemSelectAll(selectedKeys: js.Array[java.lang.String], checkAll: scala.Boolean): scala.Unit = js.native
  def onRightItemSelect(selectedKey: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def onRightItemSelectAll(selectedKeys: js.Array[java.lang.String], checkAll: scala.Boolean): scala.Unit = js.native
  def renderTransfer(transferLocale: TransferLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def separateDataSource(props: TransferProps): antdLib.Anon_LeftDataSourceRightDataSource = js.native
}

