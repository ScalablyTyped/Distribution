package typings.androiduix.android.app.AlertController

import typings.androiduix.android.app.AlertController.AlertParams.OnPrepareListViewListener
import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface.OnCancelListener
import typings.androiduix.android.content.DialogInterface.OnClickListener
import typings.androiduix.android.content.DialogInterface.OnDismissListener
import typings.androiduix.android.content.DialogInterface.OnKeyListener
import typings.androiduix.android.content.DialogInterface.OnMultiChoiceClickListener
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.LayoutInflater
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController.AlertParams")
@js.native
class AlertParams_ protected () extends js.Object {
  def this(context: Context) = this()
  var mAdapter: ListAdapter = js.native
  var mCancelable: Boolean = js.native
  var mCheckedItem: Double = js.native
  var mCheckedItems: js.Array[Boolean] = js.native
  var mContext: Context = js.native
  var mCustomTitleView: View = js.native
  var mForceInverseBackground: Boolean = js.native
  var mIcon: Drawable = js.native
  var mIconId: Double = js.native
  var mInflater: LayoutInflater = js.native
  var mIsCheckedColumn: String = js.native
  var mIsMultiChoice: Boolean = js.native
  var mIsSingleChoice: Boolean = js.native
  var mItems: js.Array[String] = js.native
  var mLabelColumn: String = js.native
  var mMessage: String = js.native
  var mNegativeButtonListener: OnClickListener = js.native
  var mNegativeButtonText: String = js.native
  var mNeutralButtonListener: OnClickListener = js.native
  var mNeutralButtonText: String = js.native
  var mOnCancelListener: OnCancelListener = js.native
  var mOnCheckboxClickListener: OnMultiChoiceClickListener = js.native
  var mOnClickListener: OnClickListener = js.native
  var mOnDismissListener: OnDismissListener = js.native
  var mOnItemSelectedListener: OnItemSelectedListener = js.native
  var mOnKeyListener: OnKeyListener = js.native
  var mOnPrepareListViewListener: OnPrepareListViewListener = js.native
  var mPositiveButtonListener: OnClickListener = js.native
  var mPositiveButtonText: String = js.native
  var mRecycleOnMeasure: Boolean = js.native
  var mTitle: String = js.native
  var mView: View = js.native
  var mViewSpacingBottom: Double = js.native
  var mViewSpacingLeft: Double = js.native
  var mViewSpacingRight: Double = js.native
  var mViewSpacingSpecified: Boolean = js.native
  var mViewSpacingTop: Double = js.native
  @JSName("apply")
  def apply(dialog: typings.androiduix.android.app.AlertController): Unit = js.native
  /* private */ def createListView(dialog: js.Any): js.Any = js.native
}

