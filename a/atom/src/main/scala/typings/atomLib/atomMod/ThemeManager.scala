package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeManager extends js.Object {
  // Managing Enabled Themes
  /** Returns an Array of strings all the active theme names. */
  def getActiveThemeNames(): js.UndefOr[js.Array[java.lang.String]]
  /** Returns an Array of all the active themes. */
  def getActiveThemes(): js.UndefOr[js.Array[Package]]
  // Managing Enabled Themes
  /** Get the enabled theme names from the config. */
  def getEnabledThemeNames(): js.Array[java.lang.String]
  // Accessing Loaded Themes
  /** Returns an Array of strings of all the loaded theme names. */
  def getLoadedThemeNames(): js.UndefOr[js.Array[java.lang.String]]
  /** Returns an Array of all the loaded themes. */
  def getLoadedThemes(): js.UndefOr[js.Array[Package]]
  // Event Subscription
  /**
    *  Invoke callback when style sheet changes associated with updating the
    *  list of active themes have completed.
    */
  def onDidChangeActiveThemes(callback: js.Function0[scala.Unit]): Disposable
}

object ThemeManager {
  @scala.inline
  def apply(
    getActiveThemeNames: js.Function0[js.UndefOr[js.Array[java.lang.String]]],
    getActiveThemes: js.Function0[js.UndefOr[js.Array[Package]]],
    getEnabledThemeNames: js.Function0[js.Array[java.lang.String]],
    getLoadedThemeNames: js.Function0[js.UndefOr[js.Array[java.lang.String]]],
    getLoadedThemes: js.Function0[js.UndefOr[js.Array[Package]]],
    onDidChangeActiveThemes: js.Function1[js.Function0[scala.Unit], Disposable]
  ): ThemeManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActiveThemeNames")(getActiveThemeNames)
    __obj.updateDynamic("getActiveThemes")(getActiveThemes)
    __obj.updateDynamic("getEnabledThemeNames")(getEnabledThemeNames)
    __obj.updateDynamic("getLoadedThemeNames")(getLoadedThemeNames)
    __obj.updateDynamic("getLoadedThemes")(getLoadedThemes)
    __obj.updateDynamic("onDidChangeActiveThemes")(onDidChangeActiveThemes)
    __obj.asInstanceOf[ThemeManager]
  }
}

