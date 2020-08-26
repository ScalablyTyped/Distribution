package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI control for the selection of views in a pane.
  *
  * Every tab of a tab bar has, besides its localized title and help text, the URL of a view. A possible alternative would be to use a command URL instead
  * of the view URL.
  *
  * In the current Impress implementation a tab bar is only used for the center pane to switch between views in the center pane. Tab bars can make sense
  * for other panes as well, i.e. for showing either the slide sorter or the outline view in the left pane.
  *
  * Tab bar buttons are identified by their resource id. Note that because the resource anchors are all the same (the tab bar), it is the resource URL
  * that really identifies a button. There can not be two buttons with the same resource id.
  *
  * A better place for this interface (in an extended version) would be `com::sun::star::awt`
  * @see TabBarButton
  */
@js.native
trait XTabBar extends js.Object {
  /**
    * Return a sequence of all the tab bar buttons.
    *
    * Their order reflects the visible order in the tab bar.
    *
    * This method can be used when {@link addTabBarButtonAfter()} does not provide enough control as to where to insert a new button.
    */
  val TabBarButtons: SafeArray[TabBarButton] = js.native
  /**
    * Add a tab bar button to the right of another one.
    * @param aButton The new tab bar button that is to be inserted. If a button with the same resource id is already present than that is removed before the n
    * @param aAnchor The new button is inserted to the right of this button. When its {@link ResourceId} is empty then the new button is inserted at the left
    */
  def addTabBarButtonAfter(aButton: TabBarButton, aAnchor: TabBarButton): Unit = js.native
  /**
    * Add a tab bar button at the right most position.
    * @param aButton The new tab bar button that is to be inserted.
    */
  def appendTabBarButton(aButton: TabBarButton): Unit = js.native
  /**
    * Return a sequence of all the tab bar buttons.
    *
    * Their order reflects the visible order in the tab bar.
    *
    * This method can be used when {@link addTabBarButtonAfter()} does not provide enough control as to where to insert a new button.
    */
  def getTabBarButtons(): SafeArray[TabBarButton] = js.native
  /**
    * Test whether the specified button exists in the tab bar.
    * @param aButton The tab bar button whose existence is tested.
    * @returns Returns `TRUE` when the button exists.
    */
  def hasTabBarButton(aButton: TabBarButton): Boolean = js.native
  /**
    * Remove a tab bar button.
    * @param aButton The tab bar button to remove. When there is no button with the specified resource id then this call is silently ignored.
    */
  def removeTabBarButton(aButton: TabBarButton): Unit = js.native
}

object XTabBar {
  @scala.inline
  def apply(
    TabBarButtons: SafeArray[TabBarButton],
    addTabBarButtonAfter: (TabBarButton, TabBarButton) => Unit,
    appendTabBarButton: TabBarButton => Unit,
    getTabBarButtons: () => SafeArray[TabBarButton],
    hasTabBarButton: TabBarButton => Boolean,
    removeTabBarButton: TabBarButton => Unit
  ): XTabBar = {
    val __obj = js.Dynamic.literal(TabBarButtons = TabBarButtons.asInstanceOf[js.Any], addTabBarButtonAfter = js.Any.fromFunction2(addTabBarButtonAfter), appendTabBarButton = js.Any.fromFunction1(appendTabBarButton), getTabBarButtons = js.Any.fromFunction0(getTabBarButtons), hasTabBarButton = js.Any.fromFunction1(hasTabBarButton), removeTabBarButton = js.Any.fromFunction1(removeTabBarButton))
    __obj.asInstanceOf[XTabBar]
  }
  @scala.inline
  implicit class XTabBarOps[Self <: XTabBar] (val x: Self) extends AnyVal {
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
    def setTabBarButtons(value: SafeArray[TabBarButton]): Self = this.set("TabBarButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddTabBarButtonAfter(value: (TabBarButton, TabBarButton) => Unit): Self = this.set("addTabBarButtonAfter", js.Any.fromFunction2(value))
    @scala.inline
    def setAppendTabBarButton(value: TabBarButton => Unit): Self = this.set("appendTabBarButton", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTabBarButtons(value: () => SafeArray[TabBarButton]): Self = this.set("getTabBarButtons", js.Any.fromFunction0(value))
    @scala.inline
    def setHasTabBarButton(value: TabBarButton => Boolean): Self = this.set("hasTabBarButton", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTabBarButton(value: TabBarButton => Unit): Self = this.set("removeTabBarButton", js.Any.fromFunction1(value))
  }
  
}

