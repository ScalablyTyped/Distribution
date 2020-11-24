package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typings.activexLibreoffice.com_.sun.star.form.XBoundControl
import typings.activexLibreoffice.com_.sun.star.form.XChangeBroadcaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a control for entering arbitrary text which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.TextField} service.
  *
  * In addition, this control can be used in HTML forms. It triggers the {@link com.sun.star.form.XSubmit.submit()} method of the form it belongs to if
  * the **enter** is pressed while it has the focus.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait TextField
  extends UnoControlEdit
     with XBoundControl
     with XChangeBroadcaster
