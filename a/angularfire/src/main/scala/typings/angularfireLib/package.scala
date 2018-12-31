package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularfireLib {
  type AngularFireAuthService = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Firebase */ /* firebase */ js.Any, 
    AngularFireAuth
  ]
  type AngularFireService = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Firebase */ /* firebase */ js.Any, 
    /* config */ js.UndefOr[js.Any], 
    AngularFire
  ]
}
