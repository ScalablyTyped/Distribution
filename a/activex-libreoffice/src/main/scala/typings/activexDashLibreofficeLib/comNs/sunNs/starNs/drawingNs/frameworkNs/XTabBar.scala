package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

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
trait XTabBar extends js.Object {
  /**
    * Return a sequence of all the tab bar buttons.
    *
    * Their order reflects the visible order in the tab bar.
    *
    * This method can be used when {@link addTabBarButtonAfter()} does not provide enough control as to where to insert a new button.
    */
  val TabBarButtons: activexDashInteropLib.SafeArray[TabBarButton]
  /**
    * Add a tab bar button to the right of another one.
    * @param aButton The new tab bar button that is to be inserted. If a button with the same resource id is already present than that is removed before the n
    * @param aAnchor The new button is inserted to the right of this button. When its {@link ResourceId} is empty then the new button is inserted at the left
    */
  def addTabBarButtonAfter(aButton: TabBarButton, aAnchor: TabBarButton): scala.Unit
  /**
    * Add a tab bar button at the right most position.
    * @param aButton The new tab bar button that is to be inserted.
    */
  def appendTabBarButton(aButton: TabBarButton): scala.Unit
  /**
    * Return a sequence of all the tab bar buttons.
    *
    * Their order reflects the visible order in the tab bar.
    *
    * This method can be used when {@link addTabBarButtonAfter()} does not provide enough control as to where to insert a new button.
    */
  def getTabBarButtons(): activexDashInteropLib.SafeArray[TabBarButton]
  /**
    * Test whether the specified button exists in the tab bar.
    * @param aButton The tab bar button whose existence is tested.
    * @returns Returns `TRUE` when the button exists.
    */
  def hasTabBarButton(aButton: TabBarButton): scala.Boolean
  /**
    * Remove a tab bar button.
    * @param aButton The tab bar button to remove. When there is no button with the specified resource id then this call is silently ignored.
    */
  def removeTabBarButton(aButton: TabBarButton): scala.Unit
}

