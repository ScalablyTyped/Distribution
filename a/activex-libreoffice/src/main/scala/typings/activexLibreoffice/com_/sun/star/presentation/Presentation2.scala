package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enhances the {@link Presentation} service to give access to a {@link XPresentation2} interface.
  * @since OOo 3.0
  */
@js.native
trait Presentation2
  extends Presentation
     with XPresentation2
object Presentation2 {
  
  @scala.inline
  def apply(
    AllowAnimations: Boolean,
    Controller: XSlideShowController,
    CustomShow: String,
    FirstPage: String,
    IsAlwaysOnTop: Boolean,
    IsAutomatic: Boolean,
    IsEndless: Boolean,
    IsFullScreen: Boolean,
    IsLivePresentation: Boolean,
    IsMouseVisible: Boolean,
    Pause: Double,
    PropertySetInfo: XPropertySetInfo,
    StartWithNavigator: Boolean,
    UsePen: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    end: () => Unit,
    getController: () => XSlideShowController,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    isRunning: () => Boolean,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    start: () => Unit,
    startWithArguments: SeqEquiv[PropertyValue] => Unit
  ): Presentation2 = {
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], CustomShow = CustomShow.asInstanceOf[js.Any], FirstPage = FirstPage.asInstanceOf[js.Any], IsAlwaysOnTop = IsAlwaysOnTop.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsEndless = IsEndless.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], IsLivePresentation = IsLivePresentation.asInstanceOf[js.Any], IsMouseVisible = IsMouseVisible.asInstanceOf[js.Any], Pause = Pause.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StartWithNavigator = StartWithNavigator.asInstanceOf[js.Any], UsePen = UsePen.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), end = js.Any.fromFunction0(end), getController = js.Any.fromFunction0(getController), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), isRunning = js.Any.fromFunction0(isRunning), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), start = js.Any.fromFunction0(start), startWithArguments = js.Any.fromFunction1(startWithArguments))
    __obj.asInstanceOf[Presentation2]
  }
}
