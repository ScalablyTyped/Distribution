package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileProviderMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[CompileDiDependencyMetadata]] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var token: CompileTokenMetadata
  var useClass: js.UndefOr[CompileTypeMetadata] = js.undefined
  var useExisting: js.UndefOr[CompileTokenMetadata] = js.undefined
  var useFactory: js.UndefOr[CompileFactoryMetadata] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

