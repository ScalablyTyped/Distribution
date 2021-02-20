package typings.androiduix.android.view

import typings.androiduix.android.content.Intent
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.MenuItem.OnMenuItemClickListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends StObject {
  
  def getActionView(): View = js.native
  
  def getGroupId(): Double = js.native
  
  def getIcon(): Drawable = js.native
  
  def getIntent(): Intent = js.native
  
  def getItemId(): Double = js.native
  
  def getOrder(): Double = js.native
  
  def getTitle(): String = js.native
  
  def invoke(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  var mActionView: js.Any = js.native
  
  var mCategoryOrder: js.Any = js.native
  
  var mClickListener: js.Any = js.native
  
  var mEnable: js.Any = js.native
  
  var mGroup: js.Any = js.native
  
  var mIconDrawable: js.Any = js.native
  
  var mId: js.Any = js.native
  
  var mIntent: js.Any = js.native
  
  var mMenu: js.Any = js.native
  
  var mOrdering: js.Any = js.native
  
  var mTitle: js.Any = js.native
  
  var mVisible: js.Any = js.native
  
  def setActionView(view: View): MenuItem = js.native
  
  def setEnabled(enabled: Boolean): MenuItem = js.native
  
  def setIcon(icon: Drawable): MenuItem = js.native
  
  def setIntent(intent: Intent): MenuItem = js.native
  
  def setOnMenuItemClickListener(menuItemClickListener: OnMenuItemClickListener): MenuItem = js.native
  
  def setTitle(title: String): MenuItem = js.native
  
  def setVisible(visible: Boolean): MenuItem = js.native
}
object MenuItem {
  
  @scala.inline
  def apply(
    getActionView: () => View,
    getGroupId: () => Double,
    getIcon: () => Drawable,
    getIntent: () => Intent,
    getItemId: () => Double,
    getOrder: () => Double,
    getTitle: () => String,
    invoke: () => Boolean,
    isEnabled: () => Boolean,
    isVisible: () => Boolean,
    mActionView: js.Any,
    mCategoryOrder: js.Any,
    mClickListener: js.Any,
    mEnable: js.Any,
    mGroup: js.Any,
    mIconDrawable: js.Any,
    mId: js.Any,
    mIntent: js.Any,
    mMenu: js.Any,
    mOrdering: js.Any,
    mTitle: js.Any,
    mVisible: js.Any,
    setActionView: View => MenuItem,
    setEnabled: Boolean => MenuItem,
    setIcon: Drawable => MenuItem,
    setIntent: Intent => MenuItem,
    setOnMenuItemClickListener: OnMenuItemClickListener => MenuItem,
    setTitle: String => MenuItem,
    setVisible: Boolean => MenuItem
  ): MenuItem = {
    val __obj = js.Dynamic.literal(getActionView = js.Any.fromFunction0(getActionView), getGroupId = js.Any.fromFunction0(getGroupId), getIcon = js.Any.fromFunction0(getIcon), getIntent = js.Any.fromFunction0(getIntent), getItemId = js.Any.fromFunction0(getItemId), getOrder = js.Any.fromFunction0(getOrder), getTitle = js.Any.fromFunction0(getTitle), invoke = js.Any.fromFunction0(invoke), isEnabled = js.Any.fromFunction0(isEnabled), isVisible = js.Any.fromFunction0(isVisible), mActionView = mActionView.asInstanceOf[js.Any], mCategoryOrder = mCategoryOrder.asInstanceOf[js.Any], mClickListener = mClickListener.asInstanceOf[js.Any], mEnable = mEnable.asInstanceOf[js.Any], mGroup = mGroup.asInstanceOf[js.Any], mIconDrawable = mIconDrawable.asInstanceOf[js.Any], mId = mId.asInstanceOf[js.Any], mIntent = mIntent.asInstanceOf[js.Any], mMenu = mMenu.asInstanceOf[js.Any], mOrdering = mOrdering.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], mVisible = mVisible.asInstanceOf[js.Any], setActionView = js.Any.fromFunction1(setActionView), setEnabled = js.Any.fromFunction1(setEnabled), setIcon = js.Any.fromFunction1(setIcon), setIntent = js.Any.fromFunction1(setIntent), setOnMenuItemClickListener = js.Any.fromFunction1(setOnMenuItemClickListener), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetActionView(value: () => View): Self = StObject.set(x, "getActionView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupId(value: () => Double): Self = StObject.set(x, "getGroupId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIcon(value: () => Drawable): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIntent(value: () => Intent): Self = StObject.set(x, "getIntent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemId(value: () => Double): Self = StObject.set(x, "getItemId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrder(value: () => Double): Self = StObject.set(x, "getOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvoke(value: () => Boolean): Self = StObject.set(x, "invoke", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMActionView(value: js.Any): Self = StObject.set(x, "mActionView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCategoryOrder(value: js.Any): Self = StObject.set(x, "mCategoryOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMClickListener(value: js.Any): Self = StObject.set(x, "mClickListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEnable(value: js.Any): Self = StObject.set(x, "mEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMGroup(value: js.Any): Self = StObject.set(x, "mGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIconDrawable(value: js.Any): Self = StObject.set(x, "mIconDrawable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMId(value: js.Any): Self = StObject.set(x, "mId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIntent(value: js.Any): Self = StObject.set(x, "mIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMenu(value: js.Any): Self = StObject.set(x, "mMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOrdering(value: js.Any): Self = StObject.set(x, "mOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTitle(value: js.Any): Self = StObject.set(x, "mTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMVisible(value: js.Any): Self = StObject.set(x, "mVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetActionView(value: View => MenuItem): Self = StObject.set(x, "setActionView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => MenuItem): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIcon(value: Drawable => MenuItem): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIntent(value: Intent => MenuItem): Self = StObject.set(x, "setIntent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnMenuItemClickListener(value: OnMenuItemClickListener => MenuItem): Self = StObject.set(x, "setOnMenuItemClickListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => MenuItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => MenuItem): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
  
  @js.native
  trait OnMenuItemClickListener extends StObject {
    
    def onMenuItemClick(item: MenuItem): Boolean = js.native
  }
  object OnMenuItemClickListener {
    
    @scala.inline
    def apply(onMenuItemClick: MenuItem => Boolean): OnMenuItemClickListener = {
      val __obj = js.Dynamic.literal(onMenuItemClick = js.Any.fromFunction1(onMenuItemClick))
      __obj.asInstanceOf[OnMenuItemClickListener]
    }
    
    @scala.inline
    implicit class OnMenuItemClickListenerMutableBuilder[Self <: OnMenuItemClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnMenuItemClick(value: MenuItem => Boolean): Self = StObject.set(x, "onMenuItemClick", js.Any.fromFunction1(value))
    }
  }
}
