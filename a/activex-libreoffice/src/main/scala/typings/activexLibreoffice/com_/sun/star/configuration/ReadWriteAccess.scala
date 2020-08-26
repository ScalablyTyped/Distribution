package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.XHierarchicalPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameReplace
import typings.activexLibreoffice.com_.sun.star.util.ChangesSet
import typings.activexLibreoffice.com_.sun.star.util.XChangesBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides easy read/write access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
@js.native
trait ReadWriteAccess
  extends XHierarchicalNameReplace
     with XChangesBatch
     with XHierarchicalPropertySetInfo {
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: String): Unit = js.native
}

object ReadWriteAccess {
  @scala.inline
  def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    create: String => Unit,
    getByHierarchicalName: String => js.Any,
    getPendingChanges: () => ChangesSet,
    getPropertyByHierarchicalName: String => Property,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: () => Boolean,
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByHierarchicalName: (String, js.Any) => Unit
  ): ReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), create = js.Any.fromFunction1(create), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[ReadWriteAccess]
  }
  @scala.inline
  implicit class ReadWriteAccessOps[Self <: ReadWriteAccess] (val x: Self) extends AnyVal {
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
    def setCreate(value: String => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

