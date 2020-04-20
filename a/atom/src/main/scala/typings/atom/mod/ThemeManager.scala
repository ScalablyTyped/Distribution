package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeManager extends js.Object {
  // Managing Enabled Themes
  /** Returns an Array of strings all the active theme names. */
  def getActiveThemeNames(): js.UndefOr[js.Array[String]]
  /** Returns an Array of all the active themes. */
  def getActiveThemes(): js.UndefOr[js.Array[Package]]
  // Managing Enabled Themes
  /** Get the enabled theme names from the config. */
  def getEnabledThemeNames(): js.Array[String]
  // Accessing Loaded Themes
  /** Returns an Array of strings of all the loaded theme names. */
  def getLoadedThemeNames(): js.UndefOr[js.Array[String]]
  /** Returns an Array of all the loaded themes. */
  def getLoadedThemes(): js.UndefOr[js.Array[Package]]
  // Event Subscription
  /**
    *  Invoke callback when style sheet changes associated with updating the
    *  list of active themes have completed.
    */
  def onDidChangeActiveThemes(callback: js.Function0[Unit]): Disposable
}

object ThemeManager {
  @scala.inline
  def apply(
    getActiveThemeNames: () => js.UndefOr[js.Array[String]],
    getActiveThemes: () => js.UndefOr[js.Array[Package]],
    getEnabledThemeNames: () => js.Array[String],
    getLoadedThemeNames: () => js.UndefOr[js.Array[String]],
    getLoadedThemes: () => js.UndefOr[js.Array[Package]],
    onDidChangeActiveThemes: js.Function0[Unit] => Disposable
  ): ThemeManager = {
    val __obj = js.Dynamic.literal(getActiveThemeNames = js.Any.fromFunction0(getActiveThemeNames), getActiveThemes = js.Any.fromFunction0(getActiveThemes), getEnabledThemeNames = js.Any.fromFunction0(getEnabledThemeNames), getLoadedThemeNames = js.Any.fromFunction0(getLoadedThemeNames), getLoadedThemes = js.Any.fromFunction0(getLoadedThemes), onDidChangeActiveThemes = js.Any.fromFunction1(onDidChangeActiveThemes))
    __obj.asInstanceOf[ThemeManager]
  }
}

