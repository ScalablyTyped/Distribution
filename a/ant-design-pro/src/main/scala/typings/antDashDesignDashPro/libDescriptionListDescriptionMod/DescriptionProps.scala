package typings.antDashDesignDashPro.libDescriptionListDescriptionMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColProps * / any */ trait DescriptionProps extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var term: js.UndefOr[ReactNode] = js.undefined
}

object DescriptionProps {
  @scala.inline
  def apply(
    column: Int | Double = null,
    key: String | Double = null,
    style: CSSProperties = null,
    term: ReactNode = null
  ): DescriptionProps = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionProps]
  }
}

