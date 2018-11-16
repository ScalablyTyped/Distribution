package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Convert extends js.Object {
  var convert: js.Function5[
    /* $el */ stdLib.HTMLElement, 
    /* schema */ apostropheLib.apostropheMod.apostropheNs.Schema, 
    /* data */ js.Any, 
    /* options */ js.Any, 
    /* callback */ js.UndefOr[js.Function0[_]], 
    _
  ]
  var newInstance: js.Function1[/* schema */ apostropheLib.apostropheMod.apostropheNs.Schema, _]
  var populate: js.Function6[
    /* data */ js.Any, 
    /* name */ java.lang.String, 
    /* $field */ js.Any, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    /* $el */ js.UndefOr[stdLib.HTMLElement], 
    /* field */ js.UndefOr[js.Any], 
    _
  ]
  var returnToError: js.Function5[
    /* $el */ stdLib.HTMLElement, 
    /* schema */ apostropheLib.apostropheMod.apostropheNs.Schema, 
    /* errorPath */ js.Any, 
    /* error */ js.Any, 
    /* callback */ js.Function0[_], 
    scala.Unit
  ]
}

