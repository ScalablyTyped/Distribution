package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a list of recently used functions.
  * @see com.sun.star.sheet.RecentFunctions
  */
@js.native
trait XRecentFunctions extends XInterface {
  
  /** returns the maximum number of entries that will be stored as recently used functions. */
  val MaxRecentFunctions: Double = js.native
  
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  var RecentFunctionIds: SafeArray[Double] = js.native
  
  /** returns the maximum number of entries that will be stored as recently used functions. */
  def getMaxRecentFunctions(): Double = js.native
  
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  def getRecentFunctionIds(): SafeArray[Double] = js.native
  
  /**
    * sets the list of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @param aRecentFunctionIds the sequence of function identifiers most recently used.
    */
  def setRecentFunctionIds(aRecentFunctionIds: SeqEquiv[Double]): Unit = js.native
}
object XRecentFunctions {
  
  @scala.inline
  def apply(
    MaxRecentFunctions: Double,
    RecentFunctionIds: SafeArray[Double],
    acquire: () => Unit,
    getMaxRecentFunctions: () => Double,
    getRecentFunctionIds: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRecentFunctionIds: SeqEquiv[Double] => Unit
  ): XRecentFunctions = {
    val __obj = js.Dynamic.literal(MaxRecentFunctions = MaxRecentFunctions.asInstanceOf[js.Any], RecentFunctionIds = RecentFunctionIds.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMaxRecentFunctions = js.Any.fromFunction0(getMaxRecentFunctions), getRecentFunctionIds = js.Any.fromFunction0(getRecentFunctionIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRecentFunctionIds = js.Any.fromFunction1(setRecentFunctionIds))
    __obj.asInstanceOf[XRecentFunctions]
  }
  
  @scala.inline
  implicit class XRecentFunctionsMutableBuilder[Self <: XRecentFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMaxRecentFunctions(value: () => Double): Self = StObject.set(x, "getMaxRecentFunctions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecentFunctionIds(value: () => SafeArray[Double]): Self = StObject.set(x, "getRecentFunctionIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxRecentFunctions(value: Double): Self = StObject.set(x, "MaxRecentFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentFunctionIds(value: SafeArray[Double]): Self = StObject.set(x, "RecentFunctionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRecentFunctionIds(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "setRecentFunctionIds", js.Any.fromFunction1(value))
  }
}
