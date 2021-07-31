package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a range of cells that can be merged. */
trait XMergeable
  extends StObject
     with XInterface {
  
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  val IsMerged: Boolean
  
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  def getIsMerged(): Boolean
  
  /** merges/unmerges the area specified by this object. */
  def merge(bMerge: Boolean): Unit
}
object XMergeable {
  
  @scala.inline
  def apply(
    IsMerged: Boolean,
    acquire: () => Unit,
    getIsMerged: () => Boolean,
    merge: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMergeable = {
    val __obj = js.Dynamic.literal(IsMerged = IsMerged.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIsMerged = js.Any.fromFunction0(getIsMerged), merge = js.Any.fromFunction1(merge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMergeable]
  }
  
  @scala.inline
  implicit class XMergeableMutableBuilder[Self <: XMergeable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIsMerged(value: () => Boolean): Self = StObject.set(x, "getIsMerged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMerged(value: Boolean): Self = StObject.set(x, "IsMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: Boolean => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
  }
}
