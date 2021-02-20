package typings.androiduix.android

import typings.androiduix.android.app.AlertController.AlertParams.OnPrepareListViewListener
import typings.androiduix.android.app.Application.ActivityLifecycleCallbacks
import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.content.DialogInterface.OnCancelListener
import typings.androiduix.android.content.DialogInterface.OnDismissListener
import typings.androiduix.android.content.DialogInterface.OnKeyListener
import typings.androiduix.android.content.DialogInterface.OnMultiChoiceClickListener
import typings.androiduix.android.content.DialogInterface.OnShowListener
import typings.androiduix.android.content.Intent
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.os.Bundle
import typings.androiduix.android.os.Handler
import typings.androiduix.android.os.Message
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.LayoutInflater
import typings.androiduix.android.view.MenuItem
import typings.androiduix.android.view.Menu_
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnClickListener
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.android.view.Window
import typings.androiduix.android.view.Window.Callback
import typings.androiduix.android.view.WindowManager
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.view.menu.MenuPopupHelper
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.android.widget.Button
import typings.androiduix.android.widget.FrameLayout
import typings.androiduix.android.widget.ListAdapter
import typings.androiduix.android.widget.ListView
import typings.androiduix.androidui.AndroidUI
import typings.androiduix.java_.lang.Runnable
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  @js.native
  trait ActionBar extends FrameLayout {
    
    def getCustomView(): View = js.native
    
    def getSubtitle(): String = js.native
    
    def getTitle(): String = js.native
    
    def hide(): Unit = js.native
    
    def hideActionLeft(): Unit = js.native
    
    def hideActionRight(): Unit = js.native
    
    def isShowing(): Boolean = js.native
    
    var mActionLeft: js.Any = js.native
    
    var mActionRight: js.Any = js.native
    
    var mCenterLayout: js.Any = js.native
    
    var mCustomView: js.Any = js.native
    
    var mSubTitleView: js.Any = js.native
    
    var mTitleView: js.Any = js.native
    
    def setActionLeft(name: String, icon: Drawable, listener: OnClickListener): Unit = js.native
    
    def setActionRight(name: String, icon: Drawable, listener: OnClickListener): Unit = js.native
    
    def setCustomView(view: View): Unit = js.native
    def setCustomView(view: View, layoutParams: MarginLayoutParams): Unit = js.native
    
    def setIcon(icon: Drawable): Unit = js.native
    
    def setLogo(logo: Drawable): Unit = js.native
    
    def setSubtitle(subtitle: String): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  trait ActionBarActivity extends Activity {
    
    def getActionBar(): ActionBar = js.native
    
    /* private */ def initActionBar(): js.Any = js.native
    
    /* private */ def initDefaultBackFinish(): js.Any = js.native
    
    var mActionBar: js.Any = js.native
    
    def setActionBar(actionBar: ActionBar): Unit = js.native
  }
  
  @js.native
  trait Activity
    extends Context
       with Callback
       with typings.androiduix.android.view.KeyEvent.Callback {
    
    def addContentView(view: View, params: LayoutParams): Unit = js.native
    
    def closeOptionsMenu(): Unit = js.native
    
    def dispatchActivityResult(who: String, requestCode: Double, resultCode: Double, data: Intent): Unit = js.native
    
    def findViewById(id: String): View = js.native
    
    def finish(): Unit = js.native
    
    def finishActivity(requestCode: Double): Unit = js.native
    
    def getApplication(): Application = js.native
    
    def getCallingActivity(): String = js.native
    
    def getCurrentFocus(): View = js.native
    
    def getGlobalWindowManager(): WindowManager = js.native
    
    def getIntent(): Intent = js.native
    
    def getTitle(): String = js.native
    
    def getWindow(): Window = js.native
    
    def hasWindowFocus(): Boolean = js.native
    
    /* private */ def invalidateOptionsMenu(): js.Any = js.native
    
    /* protected */ def invalidateOptionsMenuPopupHelper(menu: Menu_): MenuPopupHelper = js.native
    
    def isDestroyed(): Boolean = js.native
    
    def isFinishing(): Boolean = js.native
    
    def isResumed(): Boolean = js.native
    
    var mCallActivity: js.Any = js.native
    
    var mCalled: js.Any = js.native
    
    var mDestroyed: js.Any = js.native
    
    var mFinished: js.Any = js.native
    
    var mIntent: js.Any = js.native
    
    var mMenu: js.Any = js.native
    
    var mMenuPopuoHelper: js.Any = js.native
    
    var mResultCode: js.Any = js.native
    
    var mResultData: js.Any = js.native
    
    var mResumed: js.Any = js.native
    
    var mStartedActivity: js.Any = js.native
    
    var mStopped: js.Any = js.native
    
    var mVisibleFromClient: js.Any = js.native
    
    var mWindow: js.Any = js.native
    
    var mWindowAdded: js.Any = js.native
    
    def makeVisible(): Unit = js.native
    
    def navigateUpTo(upIntent: Intent): Boolean = js.native
    def navigateUpTo(upIntent: Intent, upToRootIfNotFound: Boolean): Boolean = js.native
    
    /* protected */ def onActivityResult(requestCode: Double, resultCode: Double, data: Intent): Unit = js.native
    
    def onBackPressed(): Unit = js.native
    
    /* protected */ def onCreate(): Unit = js.native
    /* protected */ def onCreate(savedInstanceState: Bundle): Unit = js.native
    
    def onCreateOptionsMenu(menu: Menu_): Boolean = js.native
    
    /* protected */ def onDestroy(): Unit = js.native
    
    def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
    
    /* protected */ def onNewIntent(intent: Intent): Unit = js.native
    
    def onOptionsItemSelected(item: MenuItem): Boolean = js.native
    
    def onOptionsMenuClosed(menu: Menu_): Unit = js.native
    
    /* protected */ def onPause(): Unit = js.native
    
    /* protected */ def onPostCreate(savedInstanceState: Bundle): Unit = js.native
    
    /* protected */ def onPostResume(): Unit = js.native
    
    def onPrepareOptionsMenu(menu: Menu_): Boolean = js.native
    
    /* protected */ def onRestart(): Unit = js.native
    
    /* protected */ def onRestoreInstanceState(savedInstanceState: Bundle): Unit = js.native
    
    /* protected */ def onResume(): Unit = js.native
    
    /* protected */ def onSaveInstanceState(outState: Bundle): Unit = js.native
    
    /* protected */ def onStart(): Unit = js.native
    
    /* protected */ def onStop(): Unit = js.native
    
    /* protected */ def onTitleChanged(title: String): Unit = js.native
    /* protected */ def onTitleChanged(title: String, color: Double): Unit = js.native
    
    def onTouchEvent(event: MotionEvent): Boolean = js.native
    
    def onUserInteraction(): Unit = js.native
    
    /* protected */ def onUserLeaveHint(): Unit = js.native
    
    def openOptionsMenu(): Unit = js.native
    
    def overrideNextTransition(
      enterAnimation: Animation,
      exitAnimation: Animation,
      resumeAnimation: Animation,
      hideAnimation: Animation
    ): Unit = js.native
    
    /* private */ def performCreate(icicle: js.Any): js.Any = js.native
    
    /* private */ def performDestroy(): js.Any = js.native
    
    /* private */ def performPause(): js.Any = js.native
    
    /* private */ def performRestart(): js.Any = js.native
    
    def performRestoreInstanceState(savedInstanceState: Bundle): Unit = js.native
    
    /* private */ def performResume(): js.Any = js.native
    
    def performSaveInstanceState(outState: Bundle): Unit = js.native
    
    /* private */ def performStart(): js.Any = js.native
    
    /* private */ def performStop(): js.Any = js.native
    
    /* private */ def performUserLeaving(): js.Any = js.native
    
    def runOnUiThread(action: Runnable): Unit = js.native
    
    def setContentView(view: String): Unit = js.native
    def setContentView(view: String, params: LayoutParams): Unit = js.native
    def setContentView(view: View): Unit = js.native
    def setContentView(view: View, params: LayoutParams): Unit = js.native
    def setContentView(view: HTMLElement): Unit = js.native
    def setContentView(view: HTMLElement, params: LayoutParams): Unit = js.native
    
    def setFinishOnTouchOutside(finish: Boolean): Unit = js.native
    
    def setIntent(newIntent: Intent): Unit = js.native
    
    def setResult(resultCode: Double): Unit = js.native
    def setResult(resultCode: Double, data: Intent): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
    def setVisible(visible: Boolean): Unit = js.native
    
    def startActivities(intents: js.Array[Intent]): Unit = js.native
    def startActivities(intents: js.Array[Intent], options: Bundle): Unit = js.native
    
    def startActivity(intent: String): Unit = js.native
    def startActivity(intent: String, options: Bundle): Unit = js.native
    def startActivity(intent: Intent): Unit = js.native
    def startActivity(intent: Intent, options: Bundle): Unit = js.native
    
    def startActivityForResult(intent: String, requestCode: Double): Unit = js.native
    def startActivityForResult(intent: String, requestCode: Double, options: Bundle): Unit = js.native
    def startActivityForResult(intent: Intent, requestCode: Double): Unit = js.native
    def startActivityForResult(intent: Intent, requestCode: Double, options: Bundle): Unit = js.native
    
    def startActivityIfNeeded(intent: Intent, requestCode: Double): Boolean = js.native
    def startActivityIfNeeded(intent: Intent, requestCode: Double, options: Bundle): Boolean = js.native
    
    def takeKeyEvents(_get: Boolean): Unit = js.native
  }
  
  @js.native
  trait ActivityThread extends StObject {
    
    var activityResumeTimeout: js.Any = js.native
    
    var androidUI: AndroidUI = js.native
    
    def canBackTo(intent: Intent): Boolean = js.native
    
    def execStartActivity(callActivity: Activity, intent: Intent): Unit = js.native
    def execStartActivity(callActivity: Activity, intent: Intent, options: Bundle): Unit = js.native
    
    def getOverrideEnterAnimation(): Animation = js.native
    
    def getOverrideExitAnimation(): Animation = js.native
    
    def getOverrideHideAnimation(): Animation = js.native
    
    def getOverrideResumeAnimation(): Animation = js.native
    
    /* private */ def getVisibleToUserActivities(): js.Any = js.native
    
    /* private */ def handleDestroyActivity(activity: js.Any, finishing: js.Any): js.Any = js.native
    
    /* private */ def handleLaunchActivity(intent: js.Any): js.Any = js.native
    
    /* private */ def handlePauseActivity(activity: js.Any): js.Any = js.native
    
    /* private */ def handleResumeActivity(a: js.Any, launching: js.Any): js.Any = js.native
    
    /* private */ def handleStopActivity(activity: js.Any, show: js.Any): js.Any = js.native
    
    /* private */ def initWithPageStack(): js.Any = js.native
    
    /* private */ def isRootActivity(activity: js.Any): js.Any = js.native
    
    var mLaunchedActivities: Set[Activity] = js.native
    
    var overrideEnterAnimation: Animation = js.native
    
    var overrideExitAnimation: Animation = js.native
    
    var overrideHideAnimation: Animation = js.native
    
    def overrideNextWindowAnimation(
      enterAnimation: Animation,
      exitAnimation: Animation,
      resumeAnimation: Animation,
      hideAnimation: Animation
    ): Unit = js.native
    
    var overrideResumeAnimation: Animation = js.native
    
    /* private */ def performDestroyActivity(activity: js.Any, finishing: js.Any): js.Any = js.native
    
    /* private */ def performLaunchActivity(intent: js.Any): js.Any = js.native
    
    /* private */ def performPauseActivity(activity: js.Any): js.Any = js.native
    
    /* private */ def performResumeActivity(a: js.Any, launching: js.Any): js.Any = js.native
    
    /* private */ def performStopActivity(activity: js.Any, saveState: js.Any): js.Any = js.native
    
    def scheduleActivityResume(): Unit = js.native
    
    def scheduleApplicationHide(): Unit = js.native
    
    var scheduleApplicationHideTimeout: js.Any = js.native
    
    def scheduleApplicationShow(): Unit = js.native
    
    def scheduleBackTo(intent: Intent): Boolean = js.native
    
    def scheduleBackToRoot(): Unit = js.native
    
    def scheduleDestroyActivity(activity: Activity): Unit = js.native
    def scheduleDestroyActivity(activity: Activity, finishing: Boolean): Unit = js.native
    
    def scheduleDestroyActivityByRequestCode(requestCode: Double): Unit = js.native
    
    def scheduleLaunchActivity(callActivity: Activity, intent: Intent): Unit = js.native
    def scheduleLaunchActivity(callActivity: Activity, intent: Intent, options: Bundle): Unit = js.native
    
    /* private */ def updateVisibility(activity: js.Any, show: js.Any): js.Any = js.native
  }
  
  @js.native
  trait AlertController extends StObject {
    
    /* private */ def centerButton(button: js.Any): js.Any = js.native
    
    def getButton(whichButton: Double): Button = js.native
    
    def getListView(): ListView = js.native
    
    def installContent(): Unit = js.native
    
    var mAdapter: js.Any = js.native
    
    var mAlertDialogLayout: js.Any = js.native
    
    var mButtonHandler: OnClickListener = js.native
    
    var mButtonNegative: js.Any = js.native
    
    var mButtonNegativeMessage: js.Any = js.native
    
    var mButtonNegativeText: js.Any = js.native
    
    var mButtonNeutral: js.Any = js.native
    
    var mButtonNeutralMessage: js.Any = js.native
    
    var mButtonNeutralText: js.Any = js.native
    
    var mButtonPositive: js.Any = js.native
    
    var mButtonPositiveMessage: js.Any = js.native
    
    var mButtonPositiveText: js.Any = js.native
    
    var mCheckedItem: js.Any = js.native
    
    var mContext: js.Any = js.native
    
    var mCustomTitleView: js.Any = js.native
    
    var mDialogInterface: js.Any = js.native
    
    var mForceInverseBackground: js.Any = js.native
    
    var mHandler: js.Any = js.native
    
    var mIcon: js.Any = js.native
    
    var mIconView: js.Any = js.native
    
    var mListItemLayout: js.Any = js.native
    
    var mListLayout: js.Any = js.native
    
    var mListView: js.Any = js.native
    
    var mMessage: js.Any = js.native
    
    var mMessageView: js.Any = js.native
    
    var mMultiChoiceItemLayout: js.Any = js.native
    
    var mScrollView: js.Any = js.native
    
    var mSingleChoiceItemLayout: js.Any = js.native
    
    var mTitle: js.Any = js.native
    
    var mTitleView: js.Any = js.native
    
    var mView: js.Any = js.native
    
    var mViewSpacingBottom: js.Any = js.native
    
    var mViewSpacingLeft: js.Any = js.native
    
    var mViewSpacingRight: js.Any = js.native
    
    var mViewSpacingSpecified: js.Any = js.native
    
    var mViewSpacingTop: js.Any = js.native
    
    var mWindow: js.Any = js.native
    
    def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
    
    def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
    
    /* private */ def setBackground(
      topPanel: js.Any,
      contentPanel: js.Any,
      customPanel: js.Any,
      hasButtons: js.Any,
      hasTitle: js.Any,
      buttonPanel: js.Any
    ): js.Any = js.native
    
    def setButton(
      whichButton: Double,
      text: String,
      listener: typings.androiduix.android.content.DialogInterface.OnClickListener,
      msg: Message
    ): Unit = js.native
    
    def setCustomTitle(customTitleView: View): Unit = js.native
    
    def setIcon(icon: Drawable): Unit = js.native
    
    def setInverseBackgroundForced(forceInverseBackground: Boolean): Unit = js.native
    
    def setMessage(message: String): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
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
    
    /* private */ def setupButtons(): js.Any = js.native
    
    /* private */ def setupContent(contentPanel: js.Any): js.Any = js.native
    
    /* private */ def setupTitle(topPanel: js.Any): js.Any = js.native
    
    /* private */ def setupView(): js.Any = js.native
  }
  object AlertController {
    
    @js.native
    trait AlertParams extends StObject {
      
      @JSName("apply")
      def apply(dialog: AlertController): Unit = js.native
      
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
      
      var mNegativeButtonListener: typings.androiduix.android.content.DialogInterface.OnClickListener = js.native
      
      var mNegativeButtonText: String = js.native
      
      var mNeutralButtonListener: typings.androiduix.android.content.DialogInterface.OnClickListener = js.native
      
      var mNeutralButtonText: String = js.native
      
      var mOnCancelListener: OnCancelListener = js.native
      
      var mOnCheckboxClickListener: OnMultiChoiceClickListener = js.native
      
      var mOnClickListener: typings.androiduix.android.content.DialogInterface.OnClickListener = js.native
      
      var mOnDismissListener: OnDismissListener = js.native
      
      var mOnItemSelectedListener: OnItemSelectedListener = js.native
      
      var mOnKeyListener: OnKeyListener = js.native
      
      var mOnPrepareListViewListener: OnPrepareListViewListener = js.native
      
      var mPositiveButtonListener: typings.androiduix.android.content.DialogInterface.OnClickListener = js.native
      
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
    object AlertParams {
      
      @scala.inline
      def apply(
        apply: AlertController => Unit,
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
        mNegativeButtonListener: typings.androiduix.android.content.DialogInterface.OnClickListener,
        mNegativeButtonText: String,
        mNeutralButtonListener: typings.androiduix.android.content.DialogInterface.OnClickListener,
        mNeutralButtonText: String,
        mOnCancelListener: OnCancelListener,
        mOnCheckboxClickListener: OnMultiChoiceClickListener,
        mOnClickListener: typings.androiduix.android.content.DialogInterface.OnClickListener,
        mOnDismissListener: OnDismissListener,
        mOnItemSelectedListener: OnItemSelectedListener,
        mOnKeyListener: OnKeyListener,
        mOnPrepareListViewListener: OnPrepareListViewListener,
        mPositiveButtonListener: typings.androiduix.android.content.DialogInterface.OnClickListener,
        mPositiveButtonText: String,
        mRecycleOnMeasure: Boolean,
        mTitle: String,
        mView: View,
        mViewSpacingBottom: Double,
        mViewSpacingLeft: Double,
        mViewSpacingRight: Double,
        mViewSpacingSpecified: Boolean,
        mViewSpacingTop: Double
      ): AlertParams = {
        val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), createListView = js.Any.fromFunction1(createListView), mAdapter = mAdapter.asInstanceOf[js.Any], mCancelable = mCancelable.asInstanceOf[js.Any], mCheckedItem = mCheckedItem.asInstanceOf[js.Any], mCheckedItems = mCheckedItems.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mCustomTitleView = mCustomTitleView.asInstanceOf[js.Any], mForceInverseBackground = mForceInverseBackground.asInstanceOf[js.Any], mIcon = mIcon.asInstanceOf[js.Any], mIconId = mIconId.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mIsCheckedColumn = mIsCheckedColumn.asInstanceOf[js.Any], mIsMultiChoice = mIsMultiChoice.asInstanceOf[js.Any], mIsSingleChoice = mIsSingleChoice.asInstanceOf[js.Any], mItems = mItems.asInstanceOf[js.Any], mLabelColumn = mLabelColumn.asInstanceOf[js.Any], mMessage = mMessage.asInstanceOf[js.Any], mNegativeButtonListener = mNegativeButtonListener.asInstanceOf[js.Any], mNegativeButtonText = mNegativeButtonText.asInstanceOf[js.Any], mNeutralButtonListener = mNeutralButtonListener.asInstanceOf[js.Any], mNeutralButtonText = mNeutralButtonText.asInstanceOf[js.Any], mOnCancelListener = mOnCancelListener.asInstanceOf[js.Any], mOnCheckboxClickListener = mOnCheckboxClickListener.asInstanceOf[js.Any], mOnClickListener = mOnClickListener.asInstanceOf[js.Any], mOnDismissListener = mOnDismissListener.asInstanceOf[js.Any], mOnItemSelectedListener = mOnItemSelectedListener.asInstanceOf[js.Any], mOnKeyListener = mOnKeyListener.asInstanceOf[js.Any], mOnPrepareListViewListener = mOnPrepareListViewListener.asInstanceOf[js.Any], mPositiveButtonListener = mPositiveButtonListener.asInstanceOf[js.Any], mPositiveButtonText = mPositiveButtonText.asInstanceOf[js.Any], mRecycleOnMeasure = mRecycleOnMeasure.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], mView = mView.asInstanceOf[js.Any], mViewSpacingBottom = mViewSpacingBottom.asInstanceOf[js.Any], mViewSpacingLeft = mViewSpacingLeft.asInstanceOf[js.Any], mViewSpacingRight = mViewSpacingRight.asInstanceOf[js.Any], mViewSpacingSpecified = mViewSpacingSpecified.asInstanceOf[js.Any], mViewSpacingTop = mViewSpacingTop.asInstanceOf[js.Any])
        __obj.asInstanceOf[AlertParams]
      }
      
      @scala.inline
      implicit class AlertParamsMutableBuilder[Self <: AlertParams] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApply(value: AlertController => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateListView(value: js.Any => js.Any): Self = StObject.set(x, "createListView", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMAdapter(value: ListAdapter): Self = StObject.set(x, "mAdapter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMCancelable(value: Boolean): Self = StObject.set(x, "mCancelable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMCheckedItem(value: Double): Self = StObject.set(x, "mCheckedItem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMCheckedItems(value: js.Array[Boolean]): Self = StObject.set(x, "mCheckedItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMCheckedItemsVarargs(value: Boolean*): Self = StObject.set(x, "mCheckedItems", js.Array(value :_*))
        
        @scala.inline
        def setMContext(value: Context): Self = StObject.set(x, "mContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMCustomTitleView(value: View): Self = StObject.set(x, "mCustomTitleView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMForceInverseBackground(value: Boolean): Self = StObject.set(x, "mForceInverseBackground", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMIcon(value: Drawable): Self = StObject.set(x, "mIcon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMIconId(value: Double): Self = StObject.set(x, "mIconId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMInflater(value: LayoutInflater): Self = StObject.set(x, "mInflater", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMIsCheckedColumn(value: String): Self = StObject.set(x, "mIsCheckedColumn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMIsMultiChoice(value: Boolean): Self = StObject.set(x, "mIsMultiChoice", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMIsSingleChoice(value: Boolean): Self = StObject.set(x, "mIsSingleChoice", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMItems(value: js.Array[String]): Self = StObject.set(x, "mItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMItemsVarargs(value: String*): Self = StObject.set(x, "mItems", js.Array(value :_*))
        
        @scala.inline
        def setMLabelColumn(value: String): Self = StObject.set(x, "mLabelColumn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMMessage(value: String): Self = StObject.set(x, "mMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMNegativeButtonListener(value: typings.androiduix.android.content.DialogInterface.OnClickListener): Self = StObject.set(x, "mNegativeButtonListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMNegativeButtonText(value: String): Self = StObject.set(x, "mNegativeButtonText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMNeutralButtonListener(value: typings.androiduix.android.content.DialogInterface.OnClickListener): Self = StObject.set(x, "mNeutralButtonListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMNeutralButtonText(value: String): Self = StObject.set(x, "mNeutralButtonText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnCancelListener(value: OnCancelListener): Self = StObject.set(x, "mOnCancelListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnCheckboxClickListener(value: OnMultiChoiceClickListener): Self = StObject.set(x, "mOnCheckboxClickListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnClickListener(value: typings.androiduix.android.content.DialogInterface.OnClickListener): Self = StObject.set(x, "mOnClickListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnDismissListener(value: OnDismissListener): Self = StObject.set(x, "mOnDismissListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnItemSelectedListener(value: OnItemSelectedListener): Self = StObject.set(x, "mOnItemSelectedListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnKeyListener(value: OnKeyListener): Self = StObject.set(x, "mOnKeyListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMOnPrepareListViewListener(value: OnPrepareListViewListener): Self = StObject.set(x, "mOnPrepareListViewListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMPositiveButtonListener(value: typings.androiduix.android.content.DialogInterface.OnClickListener): Self = StObject.set(x, "mPositiveButtonListener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMPositiveButtonText(value: String): Self = StObject.set(x, "mPositiveButtonText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMRecycleOnMeasure(value: Boolean): Self = StObject.set(x, "mRecycleOnMeasure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMTitle(value: String): Self = StObject.set(x, "mTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMView(value: View): Self = StObject.set(x, "mView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMViewSpacingBottom(value: Double): Self = StObject.set(x, "mViewSpacingBottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMViewSpacingLeft(value: Double): Self = StObject.set(x, "mViewSpacingLeft", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMViewSpacingRight(value: Double): Self = StObject.set(x, "mViewSpacingRight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMViewSpacingSpecified(value: Boolean): Self = StObject.set(x, "mViewSpacingSpecified", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMViewSpacingTop(value: Double): Self = StObject.set(x, "mViewSpacingTop", value.asInstanceOf[js.Any])
      }
      
      @js.native
      trait OnPrepareListViewListener extends StObject {
        
        def onPrepareListView(listView: ListView): Unit = js.native
      }
      object OnPrepareListViewListener {
        
        @scala.inline
        def apply(onPrepareListView: ListView => Unit): OnPrepareListViewListener = {
          val __obj = js.Dynamic.literal(onPrepareListView = js.Any.fromFunction1(onPrepareListView))
          __obj.asInstanceOf[OnPrepareListViewListener]
        }
        
        @scala.inline
        implicit class OnPrepareListViewListenerMutableBuilder[Self <: OnPrepareListViewListener] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setOnPrepareListView(value: ListView => Unit): Self = StObject.set(x, "onPrepareListView", js.Any.fromFunction1(value))
        }
      }
    }
    
    @js.native
    trait ButtonHandler extends Handler {
      
      var mDialog: js.Any = js.native
    }
    
    @js.native
    trait RecycleListView extends ListView {
      
      var mRecycleOnMeasure: Boolean = js.native
    }
  }
  
  @js.native
  trait AlertDialog extends Dialog {
    
    def getButton(whichButton: Double): Button = js.native
    
    def getListView(): ListView = js.native
    
    var mAlert: js.Any = js.native
    
    def setButton(
      whichButton: Double,
      text: String,
      listener: typings.androiduix.android.content.DialogInterface.OnClickListener
    ): Unit = js.native
    
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
  object AlertDialog {
    
    @js.native
    trait Builder extends StObject {
      
      var P: js.Any = js.native
      
      def create(): AlertDialog = js.native
      
      def getContext(): Context = js.native
      
      def setAdapter(adapter: ListAdapter, listener: typings.androiduix.android.content.DialogInterface.OnClickListener): Builder = js.native
      
      def setCancelable(cancelable: Boolean): Builder = js.native
      
      def setCustomTitle(customTitleView: View): Builder = js.native
      
      def setIcon(icon: Drawable): Builder = js.native
      
      def setInverseBackgroundForced(useInverseBackground: Boolean): Builder = js.native
      
      def setItems(
        items: js.Array[String],
        listener: typings.androiduix.android.content.DialogInterface.OnClickListener
      ): Builder = js.native
      
      def setMessage(message: String): Builder = js.native
      
      def setMultiChoiceItems(items: js.Array[String], checkedItems: js.Array[Boolean], listener: OnMultiChoiceClickListener): Builder = js.native
      
      def setNegativeButton(text: String, listener: typings.androiduix.android.content.DialogInterface.OnClickListener): Builder = js.native
      
      def setNeutralButton(text: String, listener: typings.androiduix.android.content.DialogInterface.OnClickListener): Builder = js.native
      
      def setOnCancelListener(onCancelListener: OnCancelListener): Builder = js.native
      
      def setOnDismissListener(onDismissListener: OnDismissListener): Builder = js.native
      
      def setOnItemSelectedListener(listener: OnItemSelectedListener): Builder = js.native
      
      def setOnKeyListener(onKeyListener: OnKeyListener): Builder = js.native
      
      def setPositiveButton(text: String, listener: typings.androiduix.android.content.DialogInterface.OnClickListener): Builder = js.native
      
      def setRecycleOnMeasureEnabled(enabled: Boolean): Builder = js.native
      
      def setSingleChoiceItems(
        items: js.Array[String],
        checkedItem: Double,
        listener: typings.androiduix.android.content.DialogInterface.OnClickListener
      ): Builder = js.native
      
      def setSingleChoiceItemsWithAdapter(
        adapter: ListAdapter,
        checkedItem: Double,
        listener: typings.androiduix.android.content.DialogInterface.OnClickListener
      ): Builder = js.native
      
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
  
  @js.native
  trait Application extends Context {
    
    /* private */ def collectActivityLifecycleCallbacks(): js.Any = js.native
    
    def dispatchActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit = js.native
    
    def dispatchActivityDestroyed(activity: Activity): Unit = js.native
    
    def dispatchActivityPaused(activity: Activity): Unit = js.native
    
    def dispatchActivityResumed(activity: Activity): Unit = js.native
    
    def dispatchActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit = js.native
    
    def dispatchActivityStarted(activity: Activity): Unit = js.native
    
    def dispatchActivityStopped(activity: Activity): Unit = js.native
    
    var mActivityLifecycleCallbacks: js.Any = js.native
    
    var mWindowManager: js.Any = js.native
    
    def onCreate(): Unit = js.native
    
    def registerActivityLifecycleCallbacks(callback: ActivityLifecycleCallbacks): Unit = js.native
    
    def unregisterActivityLifecycleCallbacks(callback: ActivityLifecycleCallbacks): Unit = js.native
  }
  object Application {
    
    @js.native
    trait ActivityLifecycleCallbacks extends StObject {
      
      def onActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit = js.native
      
      def onActivityDestroyed(activity: Activity): Unit = js.native
      
      def onActivityPaused(activity: Activity): Unit = js.native
      
      def onActivityResumed(activity: Activity): Unit = js.native
      
      def onActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit = js.native
      
      def onActivityStarted(activity: Activity): Unit = js.native
      
      def onActivityStopped(activity: Activity): Unit = js.native
    }
    object ActivityLifecycleCallbacks {
      
      @scala.inline
      def apply(
        onActivityCreated: (Activity, Bundle) => Unit,
        onActivityDestroyed: Activity => Unit,
        onActivityPaused: Activity => Unit,
        onActivityResumed: Activity => Unit,
        onActivitySaveInstanceState: (Activity, Bundle) => Unit,
        onActivityStarted: Activity => Unit,
        onActivityStopped: Activity => Unit
      ): ActivityLifecycleCallbacks = {
        val __obj = js.Dynamic.literal(onActivityCreated = js.Any.fromFunction2(onActivityCreated), onActivityDestroyed = js.Any.fromFunction1(onActivityDestroyed), onActivityPaused = js.Any.fromFunction1(onActivityPaused), onActivityResumed = js.Any.fromFunction1(onActivityResumed), onActivitySaveInstanceState = js.Any.fromFunction2(onActivitySaveInstanceState), onActivityStarted = js.Any.fromFunction1(onActivityStarted), onActivityStopped = js.Any.fromFunction1(onActivityStopped))
        __obj.asInstanceOf[ActivityLifecycleCallbacks]
      }
      
      @scala.inline
      implicit class ActivityLifecycleCallbacksMutableBuilder[Self <: ActivityLifecycleCallbacks] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnActivityCreated(value: (Activity, Bundle) => Unit): Self = StObject.set(x, "onActivityCreated", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnActivityDestroyed(value: Activity => Unit): Self = StObject.set(x, "onActivityDestroyed", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnActivityPaused(value: Activity => Unit): Self = StObject.set(x, "onActivityPaused", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnActivityResumed(value: Activity => Unit): Self = StObject.set(x, "onActivityResumed", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnActivitySaveInstanceState(value: (Activity, Bundle) => Unit): Self = StObject.set(x, "onActivitySaveInstanceState", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnActivityStarted(value: Activity => Unit): Self = StObject.set(x, "onActivityStarted", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnActivityStopped(value: Activity => Unit): Self = StObject.set(x, "onActivityStopped", js.Any.fromFunction1(value))
      }
    }
  }
  
  @js.native
  trait Dialog
    extends DialogInterface
       with Callback
       with typings.androiduix.android.view.KeyEvent.Callback {
    
    def addContentView(view: View, params: LayoutParams): Unit = js.native
    
    def dismissDialog(): Unit = js.native
    
    def dispatchOnCreate(savedInstanceState: Bundle): Unit = js.native
    
    def findViewById(id: String): View = js.native
    
    def getContext(): Context = js.native
    
    def getCurrentFocus(): View = js.native
    
    def getLayoutInflater(): LayoutInflater = js.native
    
    def getWindow(): Window = js.native
    
    def hide(): Unit = js.native
    
    def isShowing(): Boolean = js.native
    
    var mCancelAndDismissTaken: js.Any = js.native
    
    var mCancelMessage: js.Any = js.native
    
    var mCancelable: Boolean = js.native
    
    var mCanceled: js.Any = js.native
    
    var mContext: Context = js.native
    
    var mCreated: js.Any = js.native
    
    var mDecor: View = js.native
    
    var mDismissAction: js.Any = js.native
    
    var mDismissMessage: js.Any = js.native
    
    var mHandler: js.Any = js.native
    
    var mListenersHandler: js.Any = js.native
    
    var mOnKeyListener: js.Any = js.native
    
    var mShowMessage: js.Any = js.native
    
    var mShowing: js.Any = js.native
    
    var mWindow: Window = js.native
    
    var mWindowManager: WindowManager = js.native
    
    def onBackPressed(): Unit = js.native
    
    /* protected */ def onCreate(savedInstanceState: Bundle): Unit = js.native
    
    def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
    
    def onKeyMultiple(keyCode: Double, repeatCount: Double, event: KeyEvent): Boolean = js.native
    
    /* protected */ def onStart(): Unit = js.native
    
    /* protected */ def onStop(): Unit = js.native
    
    def onTouchEvent(event: MotionEvent): Boolean = js.native
    
    def onTrackballEvent(event: MotionEvent): Boolean = js.native
    
    /* private */ def sendDismissMessage(): js.Any = js.native
    
    /* private */ def sendShowMessage(): js.Any = js.native
    
    def setCancelMessage(msg: Message): Unit = js.native
    
    def setCancelable(flag: Boolean): Unit = js.native
    
    def setCanceledOnTouchOutside(cancel: Boolean): Unit = js.native
    
    def setContentView(view: View): Unit = js.native
    def setContentView(view: View, params: LayoutParams): Unit = js.native
    
    def setDismissMessage(msg: Message): Unit = js.native
    
    def setOnCancelListener(listener: OnCancelListener): Unit = js.native
    
    def setOnDismissListener(listener: OnDismissListener): Unit = js.native
    
    def setOnKeyListener(onKeyListener: OnKeyListener): Unit = js.native
    
    def setOnShowListener(listener: OnShowListener): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
    def show(): Unit = js.native
    
    def takeCancelAndDismissListeners(msg: String, cancel: OnCancelListener, dismiss: OnDismissListener): Boolean = js.native
    
    def takeKeyEvents(get: Boolean): Unit = js.native
  }
  object Dialog {
    
    @js.native
    trait ListenersHandler extends Handler {
      
      var mDialog: js.Any = js.native
    }
  }
}
