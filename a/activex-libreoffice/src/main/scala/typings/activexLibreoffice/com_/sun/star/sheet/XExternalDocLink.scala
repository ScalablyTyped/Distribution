package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalDocLink} service.
  * @see com.sun.star.sheet.ExternalDocLink
  * @since OOo 3.1
  */
@js.native
trait XExternalDocLink
  extends XNameAccess
     with XIndexAccess
     with XEnumerationAccess {
  
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
  var TokenIndex: Double = js.native
  
  /**
    * This method adds a new sheet cache instance to the external document link for a specified sheet name. If a sheet cache instance already exists for the
    * specified name, then the existing instance is returned.
    *
    * Note that a sheet name lookup is performed in a case-insensitive fashion.
    * @param aSheetName sheet name
    * @param DynamicCache specify whether or not the cache can grow when non-cached regions are queried. If `TRUE` , querying a non-cached cell in this sheet
    * @returns {@link com.sun.star.sheet.XExternalSheetCache} sheet cache instance
    */
  def addSheetCache(aSheetName: String, DynamicCache: Boolean): XExternalSheetCache = js.native
}
object XExternalDocLink {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    TokenIndex: Double,
    acquire: () => Unit,
    addSheetCache: (String, Boolean) => XExternalSheetCache,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XExternalDocLink = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], TokenIndex = TokenIndex.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSheetCache = js.Any.fromFunction2(addSheetCache), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExternalDocLink]
  }
  
  @scala.inline
  implicit class XExternalDocLinkOps[Self <: XExternalDocLink] (val x: Self) extends AnyVal {
    
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
    def setTokenIndex(value: Double): Self = this.set("TokenIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSheetCache(value: (String, Boolean) => XExternalSheetCache): Self = this.set("addSheetCache", js.Any.fromFunction2(value))
  }
}
