package typings.acorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ILooseParserClass = org.scalablytyped.runtime.Instantiable2[
    /* input */ java.lang.String, 
    js.UndefOr[/* options */ typings.acorn.mod.Options], 
    typings.acorn.mod.ILooseParser
  ]
  // TODO: rename type.
  type IParse = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typings.acorn.mod.Options], 
    typings.estree.mod.Program
  ]
  type PlainObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PluginsObject = org.scalablytyped.runtime.StringDictionary[js.Function2[/* p */ typings.acorn.mod.Parser, /* config */ js.Any, scala.Unit]]
}
