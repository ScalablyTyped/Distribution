package typings
package acornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acornMod {
  type ILooseParserClass = org.scalablytyped.runtime.Instantiable2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ Options], 
    ILooseParser
  ]
  // TODO: rename type.
  type IParse = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[Options], 
    estreeLib.estreeMod.Program
  ]
  type PlainObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PluginsObject = org.scalablytyped.runtime.StringDictionary[js.Function2[/* p */ Parser, /* config */ js.Any, scala.Unit]]
}
