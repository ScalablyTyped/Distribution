package typings
package androiduixLib.androidNs.appNs.AlertControllerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController.AlertParams")
@js.native
class AlertParams protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var mAdapter: androiduixLib.androidNs.widgetNs.ListAdapter = js.native
  var mCancelable: scala.Boolean = js.native
  var mCheckedItem: scala.Double = js.native
  var mCheckedItems: js.Array[scala.Boolean] = js.native
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  var mCustomTitleView: androiduixLib.androidNs.viewNs.View = js.native
  var mForceInverseBackground: scala.Boolean = js.native
  var mIcon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mIconId: scala.Double = js.native
  var mInflater: androiduixLib.androidNs.viewNs.LayoutInflater = js.native
  var mIsCheckedColumn: java.lang.String = js.native
  var mIsMultiChoice: scala.Boolean = js.native
  var mIsSingleChoice: scala.Boolean = js.native
  var mItems: js.Array[java.lang.String] = js.native
  var mLabelColumn: java.lang.String = js.native
  var mMessage: java.lang.String = js.native
  var mNegativeButtonListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener = js.native
  var mNegativeButtonText: java.lang.String = js.native
  var mNeutralButtonListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener = js.native
  var mNeutralButtonText: java.lang.String = js.native
  var mOnCancelListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnCancelListener = js.native
  var mOnCheckboxClickListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnMultiChoiceClickListener = js.native
  var mOnClickListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener = js.native
  var mOnDismissListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnDismissListener = js.native
  var mOnItemSelectedListener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemSelectedListener = js.native
  var mOnKeyListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnKeyListener = js.native
  var mOnPrepareListViewListener: androiduixLib.androidNs.appNs.AlertControllerNs.AlertParamsNs.OnPrepareListViewListener = js.native
  var mPositiveButtonListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener = js.native
  var mPositiveButtonText: java.lang.String = js.native
  var mRecycleOnMeasure: scala.Boolean = js.native
  var mTitle: java.lang.String = js.native
  var mView: androiduixLib.androidNs.viewNs.View = js.native
  var mViewSpacingBottom: scala.Double = js.native
  var mViewSpacingLeft: scala.Double = js.native
  var mViewSpacingRight: scala.Double = js.native
  var mViewSpacingSpecified: scala.Boolean = js.native
  var mViewSpacingTop: scala.Double = js.native
  @JSName("apply")
  def apply(dialog: androiduixLib.androidNs.appNs.AlertController): scala.Unit = js.native
  /* private */ def createListView(dialog: js.Any): js.Any = js.native
}

