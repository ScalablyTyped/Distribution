package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autocomplete extends StObject {
  
  def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
  ): Unit
}
object Autocomplete {
  
  @scala.inline
  def apply(
    search: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[Autocomplete]
  }
  
  @scala.inline
  implicit class AutocompleteMutableBuilder[Self <: Autocomplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(
      value: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Unit
    ): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
  }
}
