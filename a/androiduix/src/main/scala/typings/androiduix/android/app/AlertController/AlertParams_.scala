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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertParams_ extends js.Object {
  
  @JSName("apply")
  def apply(dialog: typings.androiduix.android.app.AlertController): Unit = js.native
  
  /* private */ def createListView(dialog: js.Any): js.Any = js.native
  
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
}
object AlertParams_ {
  
  @scala.inline
  def apply(
    apply: typings.androiduix.android.app.AlertController => Unit,
    createListView: js.Any => js.Any,
    mAdapter: ListAdapter,
    mCancelable: Boolean,
    mCheckedItem: Double,
    mCheckedItems: js.Array[Boolean],
    mContext: Context,
    mCustomTitleView: View,
    mForceInverseBackground: Boolean,
    mIcon: Drawable,
    mIconId: Double,
    mInflater: LayoutInflater,
    mIsCheckedColumn: String,
    mIsMultiChoice: Boolean,
    mIsSingleChoice: Boolean,
    mItems: js.Array[String],
    mLabelColumn: String,
    mMessage: String,
    mNegativeButtonListener: OnClickListener,
    mNegativeButtonText: String,
    mNeutralButtonListener: OnClickListener,
    mNeutralButtonText: String,
    mOnCancelListener: OnCancelListener,
    mOnCheckboxClickListener: OnMultiChoiceClickListener,
    mOnClickListener: OnClickListener,
    mOnDismissListener: OnDismissListener,
    mOnItemSelectedListener: OnItemSelectedListener,
    mOnKeyListener: OnKeyListener,
    mOnPrepareListViewListener: OnPrepareListViewListener,
    mPositiveButtonListener: OnClickListener,
    mPositiveButtonText: String,
    mRecycleOnMeasure: Boolean,
    mTitle: String,
    mView: View,
    mViewSpacingBottom: Double,
    mViewSpacingLeft: Double,
    mViewSpacingRight: Double,
    mViewSpacingSpecified: Boolean,
    mViewSpacingTop: Double
  ): AlertParams_ = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), createListView = js.Any.fromFunction1(createListView), mAdapter = mAdapter.asInstanceOf[js.Any], mCancelable = mCancelable.asInstanceOf[js.Any], mCheckedItem = mCheckedItem.asInstanceOf[js.Any], mCheckedItems = mCheckedItems.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mCustomTitleView = mCustomTitleView.asInstanceOf[js.Any], mForceInverseBackground = mForceInverseBackground.asInstanceOf[js.Any], mIcon = mIcon.asInstanceOf[js.Any], mIconId = mIconId.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mIsCheckedColumn = mIsCheckedColumn.asInstanceOf[js.Any], mIsMultiChoice = mIsMultiChoice.asInstanceOf[js.Any], mIsSingleChoice = mIsSingleChoice.asInstanceOf[js.Any], mItems = mItems.asInstanceOf[js.Any], mLabelColumn = mLabelColumn.asInstanceOf[js.Any], mMessage = mMessage.asInstanceOf[js.Any], mNegativeButtonListener = mNegativeButtonListener.asInstanceOf[js.Any], mNegativeButtonText = mNegativeButtonText.asInstanceOf[js.Any], mNeutralButtonListener = mNeutralButtonListener.asInstanceOf[js.Any], mNeutralButtonText = mNeutralButtonText.asInstanceOf[js.Any], mOnCancelListener = mOnCancelListener.asInstanceOf[js.Any], mOnCheckboxClickListener = mOnCheckboxClickListener.asInstanceOf[js.Any], mOnClickListener = mOnClickListener.asInstanceOf[js.Any], mOnDismissListener = mOnDismissListener.asInstanceOf[js.Any], mOnItemSelectedListener = mOnItemSelectedListener.asInstanceOf[js.Any], mOnKeyListener = mOnKeyListener.asInstanceOf[js.Any], mOnPrepareListViewListener = mOnPrepareListViewListener.asInstanceOf[js.Any], mPositiveButtonListener = mPositiveButtonListener.asInstanceOf[js.Any], mPositiveButtonText = mPositiveButtonText.asInstanceOf[js.Any], mRecycleOnMeasure = mRecycleOnMeasure.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], mView = mView.asInstanceOf[js.Any], mViewSpacingBottom = mViewSpacingBottom.asInstanceOf[js.Any], mViewSpacingLeft = mViewSpacingLeft.asInstanceOf[js.Any], mViewSpacingRight = mViewSpacingRight.asInstanceOf[js.Any], mViewSpacingSpecified = mViewSpacingSpecified.asInstanceOf[js.Any], mViewSpacingTop = mViewSpacingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertParams_]
  }
  
  @scala.inline
  implicit class AlertParams_Ops[Self <: AlertParams_] (val x: Self) extends AnyVal {
    
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
    def setApply(value: typings.androiduix.android.app.AlertController => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateListView(value: js.Any => js.Any): Self = this.set("createListView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMAdapter(value: ListAdapter): Self = this.set("mAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCancelable(value: Boolean): Self = this.set("mCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCheckedItem(value: Double): Self = this.set("mCheckedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCheckedItemsVarargs(value: Boolean*): Self = this.set("mCheckedItems", js.Array(value :_*))
    
    @scala.inline
    def setMCheckedItems(value: js.Array[Boolean]): Self = this.set("mCheckedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMContext(value: Context): Self = this.set("mContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCustomTitleView(value: View): Self = this.set("mCustomTitleView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMForceInverseBackground(value: Boolean): Self = this.set("mForceInverseBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIcon(value: Drawable): Self = this.set("mIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIconId(value: Double): Self = this.set("mIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInflater(value: LayoutInflater): Self = this.set("mInflater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsCheckedColumn(value: String): Self = this.set("mIsCheckedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsMultiChoice(value: Boolean): Self = this.set("mIsMultiChoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsSingleChoice(value: Boolean): Self = this.set("mIsSingleChoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMItemsVarargs(value: String*): Self = this.set("mItems", js.Array(value :_*))
    
    @scala.inline
    def setMItems(value: js.Array[String]): Self = this.set("mItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLabelColumn(value: String): Self = this.set("mLabelColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMessage(value: String): Self = this.set("mMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNegativeButtonListener(value: OnClickListener): Self = this.set("mNegativeButtonListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNegativeButtonText(value: String): Self = this.set("mNegativeButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNeutralButtonListener(value: OnClickListener): Self = this.set("mNeutralButtonListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNeutralButtonText(value: String): Self = this.set("mNeutralButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnCancelListener(value: OnCancelListener): Self = this.set("mOnCancelListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnCheckboxClickListener(value: OnMultiChoiceClickListener): Self = this.set("mOnCheckboxClickListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnClickListener(value: OnClickListener): Self = this.set("mOnClickListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnDismissListener(value: OnDismissListener): Self = this.set("mOnDismissListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnItemSelectedListener(value: OnItemSelectedListener): Self = this.set("mOnItemSelectedListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnKeyListener(value: OnKeyListener): Self = this.set("mOnKeyListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnPrepareListViewListener(value: OnPrepareListViewListener): Self = this.set("mOnPrepareListViewListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPositiveButtonListener(value: OnClickListener): Self = this.set("mPositiveButtonListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPositiveButtonText(value: String): Self = this.set("mPositiveButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRecycleOnMeasure(value: Boolean): Self = this.set("mRecycleOnMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTitle(value: String): Self = this.set("mTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMView(value: View): Self = this.set("mView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMViewSpacingBottom(value: Double): Self = this.set("mViewSpacingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMViewSpacingLeft(value: Double): Self = this.set("mViewSpacingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMViewSpacingRight(value: Double): Self = this.set("mViewSpacingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMViewSpacingSpecified(value: Boolean): Self = this.set("mViewSpacingSpecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMViewSpacingTop(value: Double): Self = this.set("mViewSpacingTop", value.asInstanceOf[js.Any])
  }
}
