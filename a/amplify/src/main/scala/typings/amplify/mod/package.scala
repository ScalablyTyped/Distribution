package typings.amplify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Decoder = js.Function5[
    /* data */ js.UndefOr[js.Any], 
    /* status */ js.UndefOr[java.lang.String], 
    /* xhr */ js.UndefOr[typings.jquery.JQueryXHR], 
    /* success */ js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]], 
    /* error */ js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]], 
    scala.Unit
  ]
}
