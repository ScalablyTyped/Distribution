package typings.androiduix.android.app

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface.OnCancelListener
import typings.androiduix.android.content.DialogInterface.OnClickListener
import typings.androiduix.android.content.DialogInterface.OnDismissListener
import typings.androiduix.android.content.DialogInterface.OnKeyListener
import typings.androiduix.android.content.DialogInterface.OnMultiChoiceClickListener
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.android.widget.Button
import typings.androiduix.android.widget.ListAdapter
import typings.androiduix.android.widget.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertDialog extends Dialog {
  
  def getButton(whichButton: Double): Button = js.native
  
  def getListView(): ListView = js.native
  
  var mAlert: js.Any = js.native
  
  def setButton(whichButton: Double, text: String, listener: OnClickListener): Unit = js.native
  
  def setCustomTitle(customTitleView: View): Unit = js.native
  
  def setIcon(icon: Drawable): Unit = js.native
  
  def setMessage(message: String): Unit = js.native
  
  def setView(view: View): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: js.UndefOr[scala.Nothing],
    viewSpacingTop: js.UndefOr[scala.Nothing],
    viewSpacingRight: js.UndefOr[scala.Nothing],
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: js.UndefOr[scala.Nothing],
    viewSpacingTop: js.UndefOr[scala.Nothing],
    viewSpacingRight: Double
  ): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: js.UndefOr[scala.Nothing],
    viewSpacingTop: js.UndefOr[scala.Nothing],
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(view: View, viewSpacingLeft: js.UndefOr[scala.Nothing], viewSpacingTop: Double): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: js.UndefOr[scala.Nothing],
    viewSpacingTop: Double,
    viewSpacingRight: js.UndefOr[scala.Nothing],
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: js.UndefOr[scala.Nothing],
    viewSpacingTop: Double,
    viewSpacingRight: Double
  ): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: js.UndefOr[scala.Nothing],
    viewSpacingTop: Double,
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: js.UndefOr[scala.Nothing],
    viewSpacingRight: js.UndefOr[scala.Nothing],
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: js.UndefOr[scala.Nothing],
    viewSpacingRight: Double
  ): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: js.UndefOr[scala.Nothing],
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: Double,
    viewSpacingRight: js.UndefOr[scala.Nothing],
    viewSpacingBottom: Double
  ): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double, viewSpacingRight: Double): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: Double,
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Unit = js.native
}
@JSGlobal("android.app.AlertDialog")
@js.native
object AlertDialog extends js.Object {
  
  @js.native
  trait Builder extends js.Object {
    
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
    def setView(
      view: View,
      viewSpacingLeft: js.UndefOr[scala.Nothing],
      viewSpacingTop: js.UndefOr[scala.Nothing],
      viewSpacingRight: js.UndefOr[scala.Nothing],
      viewSpacingBottom: Double
    ): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: js.UndefOr[scala.Nothing],
      viewSpacingTop: js.UndefOr[scala.Nothing],
      viewSpacingRight: Double
    ): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: js.UndefOr[scala.Nothing],
      viewSpacingTop: js.UndefOr[scala.Nothing],
      viewSpacingRight: Double,
      viewSpacingBottom: Double
    ): Builder = js.native
    def setView(view: View, viewSpacingLeft: js.UndefOr[scala.Nothing], viewSpacingTop: Double): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: js.UndefOr[scala.Nothing],
      viewSpacingTop: Double,
      viewSpacingRight: js.UndefOr[scala.Nothing],
      viewSpacingBottom: Double
    ): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: js.UndefOr[scala.Nothing],
      viewSpacingTop: Double,
      viewSpacingRight: Double
    ): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: js.UndefOr[scala.Nothing],
      viewSpacingTop: Double,
      viewSpacingRight: Double,
      viewSpacingBottom: Double
    ): Builder = js.native
    def setView(view: View, viewSpacingLeft: Double): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: Double,
      viewSpacingTop: js.UndefOr[scala.Nothing],
      viewSpacingRight: js.UndefOr[scala.Nothing],
      viewSpacingBottom: Double
    ): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: Double,
      viewSpacingTop: js.UndefOr[scala.Nothing],
      viewSpacingRight: Double
    ): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: Double,
      viewSpacingTop: js.UndefOr[scala.Nothing],
      viewSpacingRight: Double,
      viewSpacingBottom: Double
    ): Builder = js.native
    def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double): Builder = js.native
    def setView(
      view: View,
      viewSpacingLeft: Double,
      viewSpacingTop: Double,
      viewSpacingRight: js.UndefOr[scala.Nothing],
      viewSpacingBottom: Double
    ): Builder = js.native
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
}
