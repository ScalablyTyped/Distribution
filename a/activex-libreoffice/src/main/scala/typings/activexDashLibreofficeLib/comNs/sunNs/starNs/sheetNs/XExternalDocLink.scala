package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalDocLink} service.
  * @see com.sun.star.sheet.ExternalDocLink
  * @since OOo 3.1
  */
trait XExternalDocLink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess {
  /**
    * Index corresponding to the external document link.
    *
    * This index value corresponds with the external document represented by an instance of {@link com.sun.star.sheet.ExternalDocLink} . This value is
    * stored within a formula token instance.
    *
    * Each external document cache instance has a unique index value, and this index value can be used to retrieve the corresponding external document cache
    * from the parent {@link com.sun.star.sheet.ExternalDocLinks} instance.
    * @see com.sun.star.sheet.ExternalDocLinks
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.ExternalReference
    */
  var TokenIndex: scala.Double
  /**
    * This method adds a new sheet cache instance to the external document link for a specified sheet name. If a sheet cache instance already exists for the
    * specified name, then the existing instance is returned.
    *
    * Note that a sheet name lookup is performed in a case-insensitive fashion.
    * @param aSheetName sheet name
    * @param DynamicCache specify whether or not the cache can grow when non-cached regions are queried. If `TRUE` , querying a non-cached cell in this sheet
    * @returns {@link com.sun.star.sheet.XExternalSheetCache} sheet cache instance
    */
  def addSheetCache(aSheetName: java.lang.String, DynamicCache: scala.Boolean): XExternalSheetCache
}

