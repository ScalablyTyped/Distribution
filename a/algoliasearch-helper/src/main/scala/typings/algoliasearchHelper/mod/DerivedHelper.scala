package typings.algoliasearchHelper.mod

import typings.algoliasearchHelper.algoliasearchHelperStrings.error
import typings.algoliasearchHelper.algoliasearchHelperStrings.result
import typings.algoliasearchHelper.algoliasearchHelperStrings.search
import typings.algoliasearchHelper.anon.Error
import typings.algoliasearchHelper.anon.Results
import typings.algoliasearchHelper.anon.ResultsState
import typings.events.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DerivedHelper extends EventEmitter {
  
  def detach(): Unit = js.native
  
  def getModifiedState(): SearchParameters = js.native
  
  var lastResults: SearchResults[js.Any] | Null = js.native
  
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* res */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_result(event: result, cb: js.Function1[/* res */ ResultsState, Unit]): this.type = js.native
  @JSName("on")
  def on_search(event: search, cb: js.Function1[/* res */ Results, Unit]): this.type = js.native
}
