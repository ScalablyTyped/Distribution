package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.form.FormComponent
import typings.activexLibreoffice.com_.sun.star.script.XEventAttacherManager
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a form which is a group of {@link FormComponents} .
  *
  * A form fulfills several tasks, like storing the structure of its form components, storing the information concerning tab ordering and control
  * grouping, and last but not least, it provides the event environment for its contained elements.
  *
  * A form acts on the one hand like a container of {@link FormComponents} and on the other hand like a {@link FormComponent} . This generic construction
  * allows the definition of hierarchies of forms and their dependent subforms.
  * @see com.sun.star.form.FormControlModel
  */
@js.native
trait Form
  extends FormComponent
     with XContainer
     with XNameContainer
     with XIndexContainer
     with XEnumerationAccess
     with XEventAttacherManager
     with XTabControllerModel {
  def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[_] = js.native
}

