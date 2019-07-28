package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container of user actions.
  *
  * No assumption is made about any graphical representation: You could have a menu or a toolbox working with the same container describing their entries.
  *
  * Possible elements of the {@link ActionTriggerContainer} are {@link ActionTrigger} - represents a simply clickable menu entry{@link
  * ActionTriggerSeparator} - represents a separator between two entries ;  This entry type is of interest for components rendering a an {@link
  * ActionTriggerContainer}{@link ActionTriggerContainer} - represents a sub container
  */
@js.native
trait ActionTriggerContainer
  extends XIndexContainer
     with XMultiServiceFactory
     with XEnumerationAccess
     with XContainer

