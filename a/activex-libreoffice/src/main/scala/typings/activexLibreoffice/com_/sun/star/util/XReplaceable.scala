package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to replace strings in a text described by a {@link SearchDescriptor} .
  *
  * Example: replace all bold words "search for" by "look for"
  *
  * {{program example here, see documentation}}
  */
@js.native
trait XReplaceable extends XSearchable {
  
  /**
    * creates a descriptor which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createReplaceDescriptor(): XReplaceDescriptor = js.native
  
  /**
    * searches for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def replaceAll(xDesc: XSearchDescriptor): Double = js.native
}
object XReplaceable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createReplaceDescriptor: () => XReplaceDescriptor,
    createSearchDescriptor: () => XSearchDescriptor,
    findAll: XSearchDescriptor => XIndexAccess,
    findFirst: XSearchDescriptor => XInterface,
    findNext: (XInterface, XSearchDescriptor) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceAll: XSearchDescriptor => Double
  ): XReplaceable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createReplaceDescriptor = js.Any.fromFunction0(createReplaceDescriptor), createSearchDescriptor = js.Any.fromFunction0(createSearchDescriptor), findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceAll = js.Any.fromFunction1(replaceAll))
    __obj.asInstanceOf[XReplaceable]
  }
  
  @scala.inline
  implicit class XReplaceableMutableBuilder[Self <: XReplaceable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateReplaceDescriptor(value: () => XReplaceDescriptor): Self = StObject.set(x, "createReplaceDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceAll(value: XSearchDescriptor => Double): Self = StObject.set(x, "replaceAll", js.Any.fromFunction1(value))
  }
}
