package typings
package androiduixLib.androidNs.appNs.AlertDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertDialog.Builder")
@js.native
class Builder protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var P: js.Any = js.native
  def create(): androiduixLib.androidNs.appNs.AlertDialog = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def setAdapter(
    adapter: androiduixLib.androidNs.widgetNs.ListAdapter,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setCancelable(cancelable: scala.Boolean): Builder = js.native
  def setCustomTitle(customTitleView: androiduixLib.androidNs.viewNs.View): Builder = js.native
  def setIcon(icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): Builder = js.native
  def setInverseBackgroundForced(useInverseBackground: scala.Boolean): Builder = js.native
  def setItems(
    items: js.Array[java.lang.String],
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setMessage(message: java.lang.String): Builder = js.native
  def setMultiChoiceItems(
    items: js.Array[java.lang.String],
    checkedItems: js.Array[scala.Boolean],
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnMultiChoiceClickListener
  ): Builder = js.native
  def setNegativeButton(
    text: java.lang.String,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setNeutralButton(
    text: java.lang.String,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setOnCancelListener(onCancelListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnCancelListener): Builder = js.native
  def setOnDismissListener(onDismissListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnDismissListener): Builder = js.native
  def setOnItemSelectedListener(listener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemSelectedListener): Builder = js.native
  def setOnKeyListener(onKeyListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnKeyListener): Builder = js.native
  def setPositiveButton(
    text: java.lang.String,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setRecycleOnMeasureEnabled(enabled: scala.Boolean): Builder = js.native
  def setSingleChoiceItems(
    items: js.Array[java.lang.String],
    checkedItem: scala.Double,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setSingleChoiceItemsWithAdapter(
    adapter: androiduixLib.androidNs.widgetNs.ListAdapter,
    checkedItem: scala.Double,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): Builder = js.native
  def setTitle(title: java.lang.String): Builder = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View): Builder = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View, viewSpacingLeft: scala.Double): Builder = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double
  ): Builder = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double,
    viewSpacingRight: scala.Double
  ): Builder = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double,
    viewSpacingRight: scala.Double,
    viewSpacingBottom: scala.Double
  ): Builder = js.native
  def show(): androiduixLib.androidNs.appNs.AlertDialog = js.native
}

