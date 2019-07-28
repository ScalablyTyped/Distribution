package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import typings.adone.adoneStrings.LZMA_FILTERS_MAX
import typings.adone.adoneStrings.LZMA_FILTER_ARM
import typings.adone.adoneStrings.LZMA_FILTER_ARMTHUMB
import typings.adone.adoneStrings.LZMA_FILTER_IA64
import typings.adone.adoneStrings.LZMA_FILTER_LZMA1
import typings.adone.adoneStrings.LZMA_FILTER_LZMA2
import typings.adone.adoneStrings.LZMA_FILTER_POWERPC
import typings.adone.adoneStrings.LZMA_FILTER_SPARC
import typings.adone.adoneStrings.LZMA_FILTER_X86
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var id: LZMA_FILTERS_MAX | LZMA_FILTER_ARM | LZMA_FILTER_ARMTHUMB | LZMA_FILTER_IA64 | LZMA_FILTER_POWERPC | LZMA_FILTER_SPARC | LZMA_FILTER_X86 | LZMA_FILTER_LZMA1 | LZMA_FILTER_LZMA2
}

object Filter {
  @scala.inline
  def apply(
    id: LZMA_FILTERS_MAX | LZMA_FILTER_ARM | LZMA_FILTER_ARMTHUMB | LZMA_FILTER_IA64 | LZMA_FILTER_POWERPC | LZMA_FILTER_SPARC | LZMA_FILTER_X86 | LZMA_FILTER_LZMA1 | LZMA_FILTER_LZMA2
  ): Filter = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

