package typings.androiduix.android.view

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.Menu_.Callback
import typings.androiduix.java_.util.ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu_ extends StObject {
  
  def add(groupId: Double, itemId: Double, order: Double, title: String): MenuItem = js.native
  def add(title: String): MenuItem = js.native
  
  /* private */ def addInternal(group: js.Any, id: js.Any, categoryOrder: js.Any, title: js.Any): js.Any = js.native
  
  def clear(): Unit = js.native
  
  def dispatchMenuItemSelected(menu: Menu_, item: MenuItem): Boolean = js.native
  
  def findGroupIndex(group: Double): Double = js.native
  def findGroupIndex(group: Double, start: Double): Double = js.native
  
  def findItem(id: Double): MenuItem = js.native
  
  def findItemIndex(id: Double): Double = js.native
  
  def getContext(): Context = js.native
  
  def getItem(index: Double): MenuItem = js.native
  
  def getRootMenu(): Menu_ = js.native
  
  def getVisibleItems(): ArrayList[MenuItem] = js.native
  
  def hasVisibleItems(): Boolean = js.native
  
  var mCallback: js.Any = js.native
  
  var mContext: js.Any = js.native
  
  var mItems: js.Any = js.native
  
  var mVisibleItems: js.Any = js.native
  
  def onItemsChanged(structureChanged: Boolean): Unit = js.native
  
  def removeGroup(groupId: Double): Unit = js.native
  
  def removeItem(id: Double): Unit = js.native
  
  /* private */ def removeItemAtInt(index: js.Any, updateChildrenOnMenuViews: js.Any): js.Any = js.native
  
  def setCallback(cb: Callback): Unit = js.native
  
  def setGroupEnabled(group: Double, enabled: Boolean): Unit = js.native
  
  def setGroupVisible(group: Double, visible: Boolean): Unit = js.native
  
  def size(): Double = js.native
}
object Menu_ {
  
  @js.native
  trait Callback extends StObject {
    
    def onMenuItemSelected(menu: Menu_, item: MenuItem): Boolean = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(onMenuItemSelected: (Menu_, MenuItem) => Boolean): Callback = {
      val __obj = js.Dynamic.literal(onMenuItemSelected = js.Any.fromFunction2(onMenuItemSelected))
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnMenuItemSelected(value: (Menu_, MenuItem) => Boolean): Self = StObject.set(x, "onMenuItemSelected", js.Any.fromFunction2(value))
    }
  }
}
