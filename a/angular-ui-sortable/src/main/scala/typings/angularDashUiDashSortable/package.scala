package typings

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularDashUiDashSortable {
  // Diff / Omit taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
