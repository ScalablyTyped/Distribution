package typings.androiduix.androidNs.appNs.AlertDialogNs

import typings.androiduix.androidNs.appNs.AlertDialog
import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnCancelListener
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnClickListener
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnDismissListener
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnKeyListener
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnMultiChoiceClickListener
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.AdapterViewNs.OnItemSelectedListener
import typings.androiduix.androidNs.widgetNs.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertDialog.Builder")
@js.native
class Builder protected () extends js.Object {
  def this(context: Context) = this()
  var P: js.Any = js.native
  def create(): AlertDialog = js.native
  def getContext(): Context = js.native
  def setAdapter(adapter: ListAdapter, listener: OnClickListener): Builder = js.native
  def setCancelable(cancelable: Boolean): Builder = js.native
  def setCustomTitle(customTitleView: View): Builder = js.native
  def setIcon(icon: Drawable): Builder = js.native
  def setInverseBackgroundForced(useInverseBackground: Boolean): Builder = js.native
  def setItems(items: js.Array[String], listener: OnClickListener): Builder = js.native
  def setMessage(message: String): Builder = js.native
  def setMultiChoiceItems(items: js.Array[String], checkedItems: js.Array[Boolean], listener: OnMultiChoiceClickListener): Builder = js.native
  def setNegativeButton(text: String, listener: OnClickListener): Builder = js.native
  def setNeutralButton(text: String, listener: OnClickListener): Builder = js.native
  def setOnCancelListener(onCancelListener: OnCancelListener): Builder = js.native
  def setOnDismissListener(onDismissListener: OnDismissListener): Builder = js.native
  def setOnItemSelectedListener(listener: OnItemSelectedListener): Builder = js.native
  def setOnKeyListener(onKeyListener: OnKeyListener): Builder = js.native
  def setPositiveButton(text: String, listener: OnClickListener): Builder = js.native
  def setRecycleOnMeasureEnabled(enabled: Boolean): Builder = js.native
  def setSingleChoiceItems(items: js.Array[String], checkedItem: Double, listener: OnClickListener): Builder = js.native
  def setSingleChoiceItemsWithAdapter(adapter: ListAdapter, checkedItem: Double, listener: OnClickListener): Builder = js.native
  def setTitle(title: String): Builder = js.native
  def setView(view: View): Builder = js.native
  def setView(view: View, viewSpacingLeft: Double): Builder = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double): Builder = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double, viewSpacingRight: Double): Builder = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: Double,
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Builder = js.native
  def show(): AlertDialog = js.native
}

